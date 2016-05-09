
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editTodo_Scope0 {
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

class editTodo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template takes a single argument, a String containing a
 * message to display.
 */
  def apply/*5.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.19*/("""

"""),format.raw/*11.4*/("""
"""),_display_(/*12.2*/main("Overview")/*12.18*/ {_display_(Seq[Any](format.raw/*12.20*/("""



	"""),format.raw/*16.2*/("""<title> Edit TODOs </title>

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



	<div class="container">
		<center>	<h1> Legal Information </h1> </center>
		<div class=" col-md-3"> <a href="index.html" class="btn-block btn-primary btn-lg"> Overview </a></div>
		<div class=" col-md-3"> <a href="newTodo.html" class="btn-block btn-primary btn-lg col-sm-3"> Create a new TODO </a></div>
		<div class=" col-md-3"> <a href="editTodo.html" class="btn-block btn-primary btn-lg col-sm-3 active"> Edit TODO </a></div>
	  <div class=" col-md-3"> <a href="legalInformation.html" class="btn-block btn-primary btn-lg col-sm-3"> Legal Information</a></div>
	</div>

<div class="container">
  <h3> <i>Your TODOs</i></h3>

  <table class="table table-striped">
    <thead>
      <tr>
        <th>Content</th>
        <th>Deadline</th>
        <th>Progress</th>
		<th>Edit </th>
      </tr>
    </thead>
    <tbody id="todos">
      
    </tbody>
  </table>
</div>

<script  src=""""),_display_(/*52.16*/routes/*52.22*/.Assets.versioned("js/fillEdit.js")),format.raw/*52.57*/(""""></script>



""")))}),format.raw/*56.2*/("""
"""))
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
object editTodo extends editTodo_Scope0.editTodo
              /*
                  -- GENERATED --
                  DATE: Mon May 09 14:02:35 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/editTodo.scala.html
                  HASH: 9725f8eceaf1f56fe5e5466144a64d5c104335a8
                  MATRIX: 840->95|952->112|981->308|1009->310|1034->326|1074->328|1106->333|2428->1628|2443->1634|2499->1669|2545->1685
                  LINES: 30->5|35->5|37->11|38->12|38->12|38->12|42->16|78->52|78->52|78->52|82->56
                  -- GENERATED --
              */
          