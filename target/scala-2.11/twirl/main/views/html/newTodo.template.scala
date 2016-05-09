
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newTodo_Scope0 {
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

class newTodo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template takes a single argument, a String containing a *
message to display. */
  def apply/*2.25*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.42*/(""" """),format.raw/*5.16*/(""" """),_display_(/*5.18*/main("Legal Information")/*5.43*/ {_display_(Seq[Any](format.raw/*5.45*/("""




"""),format.raw/*10.1*/("""<title>New TODO</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>



<div class="container">
	<center>
		<h1>Legal Information</h1>
	</center>
	<div class=" col-md-3">
		<a href="index.html" class="btn-block btn-primary btn-lg">
			Overview </a>
	</div>
	<div class=" col-md-3">
		<a href="newTodo.html"
			class="btn-block btn-primary btn-lg col-sm-3 active"> Create a
			new TODO </a>
	</div>
	<div class=" col-md-3">
		<a href="editTodo.html" class="btn-block btn-primary btn-lg col-sm-3">
			Edit TODO </a>
	</div>
	<div class=" col-md-3">
		<a href="legalInformation.html"
			class="btn-block btn-primary btn-lg col-sm-3"> Legal Information</a>
	</div>
</div>
<div class="container">
	<p>
	<form action=""""),_display_(/*47.17*/routes/*47.23*/.HomeController.addTodo()),format.raw/*47.48*/("""" method="post">
		<div class="col-sm-6">
			<label for="task" class="sr-only"></label> <input type="text"
				name="description" maxlength="255"
				placeholder="Type in your task here!"
				class="form-control input-group col-sm-8">
		</div>
		<div class="col-sm-3">
			<label for="datetime" class="sr-only"></label> <input type="date"
				name="date" placeholder="date of expiration"
				class="form-control input-group col-sm-3">
		</div>
		<div class="col-sm-2">
			<label for="progress" class="sr-only"></label> <input type="range"
				name="progress" min="0" max="100" step="5" value="0"
				class="form-control input-group col-sm-3">
		</div>
		<div class="col-sm-1">
			<button type="submit" class="btn btn-default input-group">Create</button>
		</div>
	</form>
	</p>
</div>







""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/* * This template takes a single argument, a String containing a *
message to display. */
object newTodo extends newTodo_Scope0.newTodo
              /*
                  -- GENERATED --
                  DATE: Mon May 09 14:11:31 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/newTodo.scala.html
                  HASH: f57c79ba873a1f0204664c51ac5ffc662eae1745
                  MATRIX: 836->92|948->109|976->300|1004->302|1037->327|1076->329|1108->334|2180->1379|2195->1385|2241->1410|3063->2202
                  LINES: 28->2|33->2|33->5|33->5|33->5|33->5|38->10|75->47|75->47|75->47|105->77
                  -- GENERATED --
              */
          