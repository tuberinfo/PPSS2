
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gereon/git/PPSS2/conf/routes
// @DATE:Mon May 09 20:55:42 CEST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
