
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gereon/git/PPSS2/conf/routes
// @DATE:Sat May 07 11:26:52 CEST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_0: controllers.Application,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_0: controllers.Application
  ) = this(errorHandler, Application_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """legalInformation""", """controllers.Application.legalInformation()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.Application.todos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos""", """controllers.Application.newTodo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/""" + "$" + """id<[^/]+>""", """controllers.Application.updateTodo(id:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """todos/""" + "$" + """id<[^/]+>""", """controllers.Application.deleteTodo(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Application_legalInformation1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("legalInformation")))
  )
  private[this] lazy val controllers_Application_legalInformation1_invoker = createInvoker(
    Application_0.legalInformation(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "legalInformation",
      Nil,
      "GET",
      """""",
      this.prefix + """legalInformation"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_todos2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_Application_todos2_invoker = createInvoker(
    Application_0.todos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """todos"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_newTodo3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos")))
  )
  private[this] lazy val controllers_Application_newTodo3_invoker = createInvoker(
    Application_0.newTodo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newTodo",
      Nil,
      "POST",
      """""",
      this.prefix + """todos"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_updateTodo4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateTodo4_invoker = createInvoker(
    Application_0.updateTodo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateTodo",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """todos/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_deleteTodo5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("todos/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteTodo5_invoker = createInvoker(
    Application_0.deleteTodo(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteTodo",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """todos/""" + "$" + """id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_0.index())
      }
  
    // @LINE:6
    case controllers_Application_legalInformation1_route(params) =>
      call { 
        controllers_Application_legalInformation1_invoker.call(Application_0.legalInformation())
      }
  
    // @LINE:7
    case controllers_Application_todos2_route(params) =>
      call { 
        controllers_Application_todos2_invoker.call(Application_0.todos())
      }
  
    // @LINE:8
    case controllers_Application_newTodo3_route(params) =>
      call { 
        controllers_Application_newTodo3_invoker.call(Application_0.newTodo())
      }
  
    // @LINE:9
    case controllers_Application_updateTodo4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_updateTodo4_invoker.call(Application_0.updateTodo(id))
      }
  
    // @LINE:10
    case controllers_Application_deleteTodo5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deleteTodo5_invoker.call(Application_0.deleteTodo(id))
      }
  }
}
