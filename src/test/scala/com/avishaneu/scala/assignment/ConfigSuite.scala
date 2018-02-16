package com.avishaneu.scala.assignment


class ConfigSuite extends UnitSpec {

  "Config" should "provide empty optionals for all parameters" in {
    val config = new Config(Map())
    assert(config.checkType.isEmpty)
    assert(config.periodSeconds.isEmpty)
    assert(config.location.isEmpty)
  }

}
