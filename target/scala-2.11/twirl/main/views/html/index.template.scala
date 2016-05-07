
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Todo],Form[Todo],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(todos: List[Todo], todoForm: Form[Todo]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import views.html.tags._

Seq[Any](format.raw/*1.43*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Overview")/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""

"""),format.raw/*7.1*/("""<meta charset="utf-8">
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
		<a href="index.html" class="btn-block btn-primary btn-lg active">
			Overview </a>
	</div>
	<div class=" col-md-3">
		<a href="newTodo.html" class="btn-block btn-primary btn-lg col-sm-3">
			Create a new TODO </a>
	</div>
	<div class=" col-md-3">
		<a href="todo.html" class="btn-block btn-primary btn-lg col-sm-3">
			Edit TODO </a>
	</div>
	<div class=" col-md-3">
		<a href="legalInformation"
			class="btn-block btn-primary btn-lg col-sm-3"> Legal Information</a>
	</div>
</div>

<div class="container">
	<h3>
		<i>Your TODOs</i>
	</h3>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Content</th>
				<th>Deadline</th>
				<th>Progress</th>
				<th>Edit/Delete</th>

			</tr>
		</thead>
		<tbody>
			<tr>
				<td>Beispielseite mit dem Bootstrap Framework anlegen</td>
				<td>30. April 2016 23:55</td>
				<td>20%</td>
				<td>
					<button id="edit" type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					</button>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
				</td>

			</tr>
			<tr>
				<td>TheGi Hausaufgaben erledigen</td>
				<td>07. Mai 2016 23:55</td>
				<td>35%</td>
				<td>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					</button>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
				</td>

			</tr>
			<tr>
				<td>Essen gehen</td>
				<td>25. April 2016 21:30</td>
				<td>0%</td>
				<td>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					</button>
					<button type="button" class="btn btn-default">
						<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>
					</button>
				</td>

			</tr>
		</tbody>
	</table>
</div>

""")))}),format.raw/*100.2*/("""
"""))
      }
    }
  }

  def render(todos:List[Todo],todoForm:Form[Todo]): play.twirl.api.HtmlFormat.Appendable = apply(todos,todoForm)

  def f:((List[Todo],Form[Todo]) => play.twirl.api.HtmlFormat.Appendable) = (todos,todoForm) => apply(todos,todoForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat May 07 18:29:47 CEST 2016
                  SOURCE: /home/gereon/git/PPSS2/app/views/index.scala.html
                  HASH: 5f5db91b516b13a339975a9224cd18c399a51737
                  MATRIX: 760->1|936->42|963->86|990->88|1014->104|1053->106|1081->108|3585->2581
                  LINES: 27->1|33->1|34->4|35->5|35->5|35->5|37->7|130->100
                  -- GENERATED --
              */
          