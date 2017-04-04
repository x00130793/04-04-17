
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/FINALFIX/dsad/conf/routes
// @DATE:Tue Apr 04 15:09:49 IST 2017


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
