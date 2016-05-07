
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
import helper._

Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
 
 """),format.raw/*14.1*/(""" 
"""),_display_(/*15.2*/main("Legal Information")/*15.27*/ {_display_(Seq[Any](format.raw/*15.29*/("""

  


	"""),format.raw/*20.2*/("""<title> Legal Information </title>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>





<div class="container">
	<center>	<h1> Legal Information </h1> </center>
	<div class=" col-md-3"> <a href="index.html" class="btn-block btn-primary btn-lg"> Overview </a></div>
	<div class=" col-md-3"> <a href="newTodo.html" class="btn-block btn-primary btn-lg col-sm-3"> Create a new TODO </a></div>
	<div class=" col-md-3"> <a href="todo.html" class="btn-block btn-primary btn-lg col-sm-3"> Edit TODO </a></div>
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
                  DATE: Sat May 07 18:10:04 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/legalInformation.scala.html
                  HASH: 721348558febe1ab020d6f89f3c4c2cf7ffb89a1
                  MATRIX: 856->95|983->112|1012->308|1043->329|1072->332|1106->357|1146->359|1181->367
                  LINES: 30->5|35->5|37->11|39->14|40->15|40->15|40->15|45->20
                  -- GENERATED --
              */
          