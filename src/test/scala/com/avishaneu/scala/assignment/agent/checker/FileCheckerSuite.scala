package com.avishaneu.scala.assignment.agent.checker

import java.io.File

import com.avishaneu.scala.assignment.UnitSpec

class FileCheckerSuite extends UnitSpec  {

  "FileChecker" should "return Unhealthy if file does not exist" in {
    new FileChecker("1.test").check mustBe an[Unhealthy]
  }

  "FileChecker" should "return Healthy if file exists" in {
    val file = new File("1.test")
    file.createNewFile()
    new FileChecker("1.test").check mustBe an[Healthy]
    file.delete()
  }
}

