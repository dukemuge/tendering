
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
        <a class="brand" href=""><img src=""""),_display_(/*9.45*/routes/*9.51*/.Assets.versioned("img/logo.png ")),format.raw/*9.85*/("""" alt="" width="320"
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
    <div class="container-fluid">


        <div class="content">
            <div class="row-fluid">
                <div class="span2">&nbsp;</div>
                <div class="span6">
                    <div class="login-container">
                        <div class="login-span">


                            """),_display_(/*41.30*/helper/*41.36*/.form(action = routes.HomeController.upload, Symbol("enctype") ->
                            "multipart/form-data")/*42.51*/ {_display_(Seq[Any](format.raw/*42.53*/("""
                            """),_display_(/*43.30*/helper/*43.36*/.inputFile(form("name"))),format.raw/*43.60*/("""
                            """),_display_(/*44.30*/helper/*44.36*/.CSRF.formField),format.raw/*44.51*/("""
                            """),format.raw/*45.29*/("""<input type="submit" id="upload" value="upload file" />
                            """)))}),format.raw/*46.30*/("""

                            """)))}),format.raw/*48.30*/("""
                        """),format.raw/*49.25*/("""</div>
                    </div>

                </div>
            </div>
        </div>
        <br>


        <div class="content">
            <div class="row-fluid">
                <div class="span16">
                    <h4 class="under-border">TABLE SHOWING SUMMARY OF SHIPMENT AND PROVIDERS</h4>

                    <div class="table-responsive">
                        <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">

                            <p>
                                <input type='button' value='Click to show data in Table' id='bt'>
                            </p>
                            <div id='showData'></div>
                            <script>
                                $('#bt').click(function () """),format.raw/*71.60*/("""{"""),format.raw/*71.61*/("""
                                    """),format.raw/*72.37*/("""$.getJSON("http://localhost/9000/providers", function (data) """),format.raw/*72.98*/("""{"""),format.raw/*72.99*/("""

                                        """),format.raw/*74.41*/("""let keys;
                                        let items = [];

                                        $.each(data, function (index, value) """),format.raw/*77.78*/("""{"""),format.raw/*77.79*/("""
                                            """),format.raw/*78.45*/("""keys = Object.keys(value);
                                            items.push(value);
                                        """),format.raw/*80.41*/("""}"""),format.raw/*80.42*/(""");

                                        let table = document.createElement("table");
                                        let tr = table.insertRow(-1);

                                        // First, create table header.
                                        for (let i = 0; i < keys.length; i++) """),format.raw/*86.79*/("""{"""),format.raw/*86.80*/("""
                                            """),format.raw/*87.45*/("""let th = document.createElement('th');
                                            th.innerHTML = keys[i];
                                            tr.appendChild(th);
                                        """),format.raw/*90.41*/("""}"""),format.raw/*90.42*/("""

                                        """),format.raw/*92.41*/("""// Now, show the details in rows and columns.
                                        for (let k = 0; k < items.length; k++) """),format.raw/*93.80*/("""{"""),format.raw/*93.81*/("""
                                            """),format.raw/*94.45*/("""tr = table.insertRow(-1);

                                            for (let j = 0; j < keys.length; j++) """),format.raw/*96.83*/("""{"""),format.raw/*96.84*/("""
                                                """),format.raw/*97.49*/("""let tabCell = tr.insertCell(-1);

                                                // Check if its a negative number.
                                                // Math.sign() method is a new ES6 feature, to check if a number is positive or negative.
                                                if (Math.sign(items[k][keys[j]]) === -1) """),format.raw/*101.90*/("""{"""),format.raw/*101.91*/("""
                                                    """),format.raw/*102.53*/("""tabCell.innerHTML = '<span style="color:red;">' +
                                                        items[k][keys[j]] + '</span>';
                                                """),format.raw/*104.49*/("""}"""),format.raw/*104.50*/("""
                                                """),format.raw/*105.49*/("""else """),format.raw/*105.54*/("""{"""),format.raw/*105.55*/("""
                                                    """),format.raw/*106.53*/("""tabCell.innerHTML = items[k][keys[j]];
                                                """),format.raw/*107.49*/("""}"""),format.raw/*107.50*/("""
                                            """),format.raw/*108.45*/("""}"""),format.raw/*108.46*/("""
                                        """),format.raw/*109.41*/("""}"""),format.raw/*109.42*/("""

                                        """),format.raw/*111.41*/("""// Add the newly created table to the DIV element.
                                        let eleShow = document.getElementById('showData');
                                        eleShow.innerHTML = '';
                                        eleShow.appendChild(table);
                                    """),format.raw/*115.37*/("""}"""),format.raw/*115.38*/(""");
                                """),format.raw/*116.33*/("""}"""),format.raw/*116.34*/(""");
                            </script>


                        </table>
                    </div>
                </div>
            </div>



        </div>


        <hr>
        <!-- Placed at the end of the document so the pages load faster -->

        <script src="jquery3/jquery-3.3.1.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="datatables/js/jquery.dataTables.min.js"></script>
        <script src="datatables/js/dataTables.bootstrap4.min.js"></script>
        <script src="datatables/js/sb-admin-datatables.min.js"></script>


"""))
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
                  HASH: c7242032c77eb14e677e410c2a0e950233c8c9fe
                  MATRIX: 771->1|940->77|969->81|1015->119|1054->121|1082->123|1245->260|1259->266|1313->300|2189->1149|2204->1155|2329->1271|2369->1273|2426->1303|2441->1309|2486->1333|2543->1363|2558->1369|2594->1384|2651->1413|2767->1498|2829->1529|2882->1554|3689->2333|3718->2334|3783->2371|3872->2432|3901->2433|3971->2475|4143->2619|4172->2620|4245->2665|4403->2795|4432->2796|4769->3105|4798->3106|4871->3151|5110->3362|5139->3363|5209->3405|5362->3530|5391->3531|5464->3576|5601->3685|5630->3686|5707->3735|6080->4079|6110->4080|6192->4133|6406->4318|6436->4319|6514->4368|6548->4373|6578->4374|6660->4427|6776->4514|6806->4515|6880->4560|6910->4561|6980->4602|7010->4603|7081->4645|7420->4955|7450->4956|7514->4991|7544->4992
                  LINES: 21->1|26->2|29->5|29->5|29->5|31->7|33->9|33->9|33->9|65->41|65->41|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|70->46|72->48|73->49|95->71|95->71|96->72|96->72|96->72|98->74|101->77|101->77|102->78|104->80|104->80|110->86|110->86|111->87|114->90|114->90|116->92|117->93|117->93|118->94|120->96|120->96|121->97|125->101|125->101|126->102|128->104|128->104|129->105|129->105|129->105|130->106|131->107|131->107|132->108|132->108|133->109|133->109|135->111|139->115|139->115|140->116|140->116
                  -- GENERATED --
              */
          