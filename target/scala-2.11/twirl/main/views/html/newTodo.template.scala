
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

     object newTodo_Scope1 {
import helper._

class newTodo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("Overview")/*3.18*/ {_display_(Seq[Any](format.raw/*3.20*/("""


"""),format.raw/*6.1*/("""<meta charset="utf-8">
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
		<a href="todo.html" class="btn-block btn-primary btn-lg col-sm-3">
			Edit TODO </a>
	</div>
	<div class=" col-md-3">
		<a href="legalInformation.html"
			class="btn-block btn-primary btn-lg col-sm-3"> Legal Information</a>
	</div>
</div>

<div class="container">
	<p>
	<form action="index.html" method="get" class="form-horizontal">
		<div class="col-sm-6">
			<label for="task" class="sr-only"></label> <input type="text"
				id="task" maxlength="255" placeholder="Type in your task here!"
				class="form-control input-group col-sm-8">
		</div>
		<div class="col-sm-3">
			<label for="datetime" class="sr-only"></label> <input
				type="datetime-local" id="datetime"
				placeholder="datetime of expiration"
				class="form-control input-group col-sm-3">
		</div>
		<div class="col-sm-2">
			<label for="progress" class="sr-only"></label> <input type="range"
				id="progress" min="0" max="100" step="5" value="0"
				class="form-control input-group col-sm-3">
		</div>
		<div class="col-sm-1">
			<button type="submit" class="btn btn-default input-group">Create</button>
		</div>
	</form>
	</p>
</div>


""")))}),format.raw/*65.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}
}

/**/
object newTodo extends newTodo_Scope0.newTodo_Scope1.newTodo
              /*
                  -- GENERATED --
                  DATE: Sat May 07 18:10:04 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/newTodo.scala.html
                  HASH: e2ca2dbcbae3a9e52a67e866647622eba1826c57
                  MATRIX: 877->19|901->35|940->37|969->40|2838->1879
                  LINES: 35->3|35->3|35->3|38->6|97->65
                  -- GENERATED --
              */
          