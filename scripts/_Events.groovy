
eventTestPhasesStart = { ->
  def service = Class.forName('grails.plugin.geb.saucelabs.SauceGebTestService').newInstance()
  service.useSauceConnect = buildConfig.grails.plugin.'geb-saucelabs'.useSauceConnect
  service.init(eventListener)
}
