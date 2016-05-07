
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gereon/git/PPSS2/conf/routes
// @DATE:Sat May 07 11:26:52 CEST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:5
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def todos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.todos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
        }
      """
    )
  
    // @LINE:10
    def deleteTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteTodo",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:8
    def newTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newTodo",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
        }
      """
    )
  
    // @LINE:6
    def legalInformation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.legalInformation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "legalInformation"})
        }
      """
    )
  
    // @LINE:9
    def updateTodo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateTodo",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
