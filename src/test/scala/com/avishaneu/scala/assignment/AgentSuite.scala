package com.avishaneu.scala.assignment

import com.avishaneu.scala.assignment.agent.Agent

class AgentSuite extends UnitSpec {

  "Agent" should "fail if no frequency specified" in {
    val config = new Config(Map())
    assertThrows[IllegalArgumentException] {
      new Agent(config).start()
    }
  }
}
