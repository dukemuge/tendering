
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*8.1*/("""

"""),format.raw/*10.1*/("""<html lang="en">

<head>
    """),format.raw/*13.58*/("""
    """),format.raw/*14.5*/("""<title>"""),_display_(/*14.13*/title),format.raw/*14.18*/("""</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("css/style_2016.css")),format.raw/*16.63*/("""" rel="stylesheet">
    <script src=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("jquery3/jquery-3.3.1.js")),format.raw/*17.69*/(""""></script>


    <link href=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("datatables/css/dataTables.bootstrap4.min.css")),format.raw/*20.89*/("""" rel="stylesheet">

</head>

<body>
    """),format.raw/*26.27*/("""
    """),_display_(/*27.6*/content),format.raw/*27.13*/("""
"""),format.raw/*28.1*/("""</body>


</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 8ccd5bb5c35b5c6cd5d40d14e3d7b62ead018f5d
                  MATRIX: 982->255|1106->286|1135->288|1192->370|1224->375|1259->383|1285->388|1370->446|1385->452|1447->493|1494->513|1509->519|1569->558|1634->596|1649->602|1714->646|1772->677|1787->683|1873->748|1942->874|1974->880|2002->887|2030->888
                  LINES: 26->7|31->8|33->10|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|43->20|43->20|43->20|48->26|49->27|49->27|50->28
                  -- GENERATED --
              */
          