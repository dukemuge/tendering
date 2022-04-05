package controllers

import java.io.File
import javax.inject._
import play.api.data.Form
import play.api.data.Forms._
import play.api.mvc._
import models.{Rates, Shipment}
import play.api.libs.json.{JsArray, Json}
import scala.io.Source
import scala.concurrent.{ExecutionContext, Future}

case class FormData(name: String)


/**
 * This controller handles a file upload.
 */
@Singleton
class HomeController @Inject() (cc:MessagesControllerComponents)
                               (implicit executionContext: ExecutionContext)
  extends MessagesAbstractController(cc) {


  val form = Form(
    mapping(
      "name" -> text
    )(FormData.apply)(FormData.unapply)
  )




//Determine range
  case class MinMax(min: Double, max: Double) {
    def contains(v: Double): Boolean = {
      (min <= v) && (max >= v)
    }
  }



   val shipments  = Seq(Shipment)

val rates = Rates.availableRates
  def findProviders( shipments: List[Shipment], rates: List[Rates]) = {
    (for{
      s <-  shipments
      r <-   rates
      if s.Country ==  r.country  && MinMax(r.lowerLimit,r.upperLimit).contains(s.weight)
    } yield (s.id,s.weight,s.Country,r.price,r.providerName))

  }

  //Get providers
   def findCostPerProvider( shipments: List[Shipment], rates: List[Rates],providerName:String) = {
    (for{
      s <-  shipments
      r <-   rates
      if s.Country ==  r.country  && MinMax(r.lowerLimit,r.upperLimit).contains(s.weight) &&  r.providerName.contains(providerName)
    } yield (r.price))
  }



  /**
   * Renders a start page.
   */
  def index = Action { implicit request =>
    Ok(views.html.index(form))
  }

  /**
   * upload files
   * @return
   */
  def upload()=Action(parse.multipartFormData){ request=>{
    request.body.file("csv").map( csv=>{
      //file name
      val fileName = csv.filename
   val toFile = new File(s"/home/duke/Desktop/files/$fileName")
      toFile.createNewFile()
      // Upload file Save to the specified location
      csv.ref.moveTo(toFile,true)


      def parseCsv(): Seq[Shipment] = {
        for {
      line <- Source.fromFile(s"/home/duke/Desktop/files/$fileName").getLines().drop(1).toVector
      values = line.split(",").map(_.trim)
    } yield Shipment(values(0).toInt, values(1), values(2).toInt)
  }
       val providers = findProviders(parseCsv().toList, Rates.availableRates)
      val JsonData =   (JsArray(providers.map(item => Json.obj("id" -> item._1, "weight" -> item._2, "country" -> item._3,"price" -> item._4,"providerName"  -> item._5))))
     Ok(JsonData)
    }
    ).getOrElse(
      Ok("error  uploading File")
    )
  }
  }

}
