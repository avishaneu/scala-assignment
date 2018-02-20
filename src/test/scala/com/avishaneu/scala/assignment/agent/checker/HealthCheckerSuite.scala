package com.avishaneu.scala.assignment.agent.checker

import com.avishaneu.scala.assignment.UnitSpec

class HealthCheckerSuite extends UnitSpec  {

  "HealthChecker" should "always return Healthy" in {
    new HealthChecker().check mustBe an[Healthy]
  }

}
