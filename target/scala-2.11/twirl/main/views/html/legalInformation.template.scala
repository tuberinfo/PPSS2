
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object legalInformation_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class legalInformation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Legal Information")/*12.27*/ {_display_(Seq[Any](format.raw/*12.29*/("""

  


	"""),format.raw/*17.2*/("""<title> Legal Information </title>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>





<div class="container">
	<center>	<h1> Legal Information </h1> </center>
	<div class=" col-md-3"> <a href="index.html" class="btn-block btn-primary btn-lg"> Overview </a></div>
	<div class=" col-md-3"> <a href="newTodo.html" class="btn-block btn-primary btn-lg col-sm-3"> Create a new TODO </a></div>
	<div class=" col-md-3"> <a href="editTodo.html" class="btn-block btn-primary btn-lg col-sm-3"> Edit TODO </a></div>
  <div class=" col-md-3"> <a href="legalInformation.html" class="btn-block btn-primary btn-lg col-sm-3 active"> Legal Information</a></div>
</div>

<div class="container">
  <div class="col-md-6">
    <h2>Legal Information</h2>
    <p>
      This is a dummy ToDo-List-website.<br />
      made by:<br />
      Jonathan Bader, Gereon Dusella<br />
      Programmierpraktikum Soziale Netzwerke SoSe 2016<br />
      Fachgebiet Komplexe und Verteilte IT Systeme (CIT) TU Berlin
    </p>
  </div>
</div>





""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/*
 * This template takes a single argument, a String containing a
 * message to display.
 */
object legalInformation extends legalInformation_Scope0.legalInformation
              /*
                  -- GENERATED --
                  DATE: Mon May 09 14:02:35 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/legalInformation.scala.html
                  HASH: df00ded93febbb079d5b00035ec4280689661822
                  MATRIX: 856->95|968->112|997->308|1025->310|1059->335|1099->337|1134->345
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|43->17
                  -- GENERATED --
              */
          