
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[controllers.FormData],MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[controllers.FormData])(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""


"""),_display_(/*5.2*/main("Transinnovate Tendering System")/*5.40*/ {_display_(Seq[Any](format.raw/*5.42*/("""

"""),format.raw/*7.1*/("""<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner clearfix">
        <a class="brand" href=""><img src=""""),_display_(/*9.45*/routes/*9.51*/.Assets.versioned("images/logo.png ")),format.raw/*9.88*/("""" alt="" width="320"
                height="52" /></a>

    </div>
</div>

<div class="row-fluid">
    <div class="sidebar-nav">
        <ul class="nav nav-list">
            <li class="nav-header">Tendering details</li>
            <li>
                <a href="projects.html" title="add and view projects">
                    Upload csv and view details
                </a>
            </li>


        </ul>
        <ul class="thumbnails" style="padding-top: 10px; min-height: 100px;" id="friendsList">
        </ul>
    </div>



    <div class="content">
        <div class="row-fluid">
            <div class="span2">&nbsp;</div>
            <div class="span6">
                <div class="login-container">
                    <div class="login-span">

                        <form action="/upload/form" method="post" enctype="multipart/form-data">
                            <table>
                                <tr>
                                    <td>
                                        audio:
                                    </td>
                                    <td>
                                        <input name="csv" type="file">
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2"><input type="submit" value="submit" id ="#stop"></td>
                                </tr>
                            </table>
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </div>


    <div>
        <h1>Displaying JSON Data with Ajax</h1>
        <table id='table' width='100%'>
            <tr>
                <th>id</th>
                <th>weight</th>
                <th>country</th>
                <th>price</th>
                <th>providerNmae</th>

            </tr>
            <script>
                $("#stop").click(function () """),format.raw/*75.46*/("""{"""),format.raw/*75.47*/("""
                    """),format.raw/*76.21*/("""$.getJSON('http://localhost:9000/upload/form',
                        function (data) """),format.raw/*77.41*/("""{"""),format.raw/*77.42*/("""
                        """),format.raw/*78.25*/("""var rows = '';
                        $.each(data, function (key, value) """),format.raw/*79.60*/("""{"""),format.raw/*79.61*/("""
                            """),format.raw/*80.29*/("""rows += `
                            <tr>
                            <td> $"""),format.raw/*82.35*/("""{"""),format.raw/*82.36*/("""data[key].id"""),format.raw/*82.48*/("""}"""),format.raw/*82.49*/(""" """),format.raw/*82.50*/("""</td>
                            <td> $"""),format.raw/*83.35*/("""{"""),format.raw/*83.36*/("""data[key].weight"""),format.raw/*83.52*/("""}"""),format.raw/*83.53*/(""" """),format.raw/*83.54*/("""</td>
                            <td> $"""),format.raw/*84.35*/("""{"""),format.raw/*84.36*/("""data[key].country"""),format.raw/*84.53*/("""}"""),format.raw/*84.54*/(""" """),format.raw/*84.55*/("""</td>
                            <td> $"""),format.raw/*85.35*/("""{"""),format.raw/*85.36*/("""data[key].price"""),format.raw/*85.51*/("""}"""),format.raw/*85.52*/(""" """),format.raw/*85.53*/("""</td>
                             <td> $"""),format.raw/*86.36*/("""{"""),format.raw/*86.37*/("""data[key].providerName"""),format.raw/*86.59*/("""}"""),format.raw/*86.60*/(""" """),format.raw/*86.61*/("""</td>

                            </tr>
                            `;
                        """),format.raw/*90.25*/("""}"""),format.raw/*90.26*/(""");
                        $('#table').append(rows);
                    """),format.raw/*92.21*/("""}"""),format.raw/*92.22*/(""");
                """),format.raw/*93.17*/("""}"""),format.raw/*93.18*/(""");
            </script>
        </table>
    </div>


    """)))}))
      }
    }
  }

  def render(form:Form[controllers.FormData],request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form)(request)

  def f:((Form[controllers.FormData]) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form) => (request) => apply(form)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 4b9a041383ccd731e46a039afb9bb785beef1f84
                  MATRIX: 771->1|940->77|969->81|1015->119|1054->121|1082->123|1245->260|1259->266|1316->303|3308->2267|3337->2268|3386->2289|3501->2376|3530->2377|3583->2402|3685->2476|3714->2477|3771->2506|3876->2583|3905->2584|3945->2596|3974->2597|4003->2598|4071->2638|4100->2639|4144->2655|4173->2656|4202->2657|4270->2697|4299->2698|4344->2715|4373->2716|4402->2717|4470->2757|4499->2758|4542->2773|4571->2774|4600->2775|4669->2816|4698->2817|4748->2839|4777->2840|4806->2841|4930->2937|4959->2938|5060->3011|5089->3012|5136->3031|5165->3032
                  LINES: 21->1|26->2|29->5|29->5|29->5|31->7|33->9|33->9|33->9|99->75|99->75|100->76|101->77|101->77|102->78|103->79|103->79|104->80|106->82|106->82|106->82|106->82|106->82|107->83|107->83|107->83|107->83|107->83|108->84|108->84|108->84|108->84|108->84|109->85|109->85|109->85|109->85|109->85|110->86|110->86|110->86|110->86|110->86|114->90|114->90|116->92|116->92|117->93|117->93
                  -- GENERATED --
              */
          