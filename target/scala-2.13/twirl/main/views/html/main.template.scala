
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
    <link href=""""),_display_(/*16.18*/routes/*16.24*/.Assets.versioned("datatables/css/dataTables.bootstrap4.min.css")),format.raw/*16.89*/("""" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.5.1.js">
    </script>

</head>

<body>
    """),format.raw/*24.27*/("""
    """),_display_(/*25.6*/content),format.raw/*25.13*/("""
"""),format.raw/*26.1*/("""</body>


</html>"""))
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
                  HASH: d20f9fc0150fc3cf7ccdb7436ef3f3873af5b829
                  MATRIX: 982->255|1106->286|1135->288|1192->370|1224->375|1259->383|1285->388|1370->446|1385->452|1447->493|1494->513|1509->519|1595->584|1737->783|1769->789|1797->796|1825->797
                  LINES: 26->7|31->8|33->10|36->13|37->14|37->14|37->14|38->15|38->15|38->15|39->16|39->16|39->16|46->24|47->25|47->25|48->26
                  -- GENERATED --
              */
          