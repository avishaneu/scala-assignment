package com.avishaneu.scala.assignment.agent.checker

import com.avishaneu.scala.assignment.{Config, UnitSpec}

class CheckerSuite extends UnitSpec  {

  "Checker" should "fail if no check type specified" in {
    val config = new Config(Map())
    assertThrows[IllegalArgumentException] {
      Checker.getImplementation(config)
    }
  }

  "Checker" should "fail if non-existent check type specified" in {
    val config = new Config(Map())
    config.checkType = Option.apply("Does Not Exist")
    assertThrows[IllegalArgumentException] {
      Checker.getImplementation(config)
    }
  }

  "Checker" should "return Health Check" in {
    val config = new Config(Map())
    config.checkType = Option.apply("healthCheck")
    val checker = Checker.getImplementation(config)
    checker mustBe an[HealthChecker]
  }

  "Checker" should "fail for File Check with no location" in {
    val config = new Config(Map())
    config.checkType = Option.apply("fileCheck")
    config.location = Option.empty
    assertThrows[IllegalArgumentException] {
      Checker.getImplementation(config)
    }
  }

  "Checker" should "return File Check" in {
    val config = new Config(Map())
    config.checkType = Option.apply("fileCheck")
    config.location = Option.apply("location")
    val checker = Checker.getImplementation(config)
    checker mustBe an[FileChecker]
  }
}

