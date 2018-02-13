# scala-assignment

*Scala courses assignment - Server Health Check Agent*

Requirements
------------
* jvm

Usage
-----
To run the application use

    > java -cp dist/health-check-agent-assembly-1.0.jar com.avishaneu.scala.assignment.Application [parameters]
    
To build an executable (by java cli) jar use sbt assembly plugin:
    
    > sbt assembly

Parameters
----------
* --frequency [*number*] - time in seconds between two consecutive checks
* --type [healthCheck, fileCheck] - type of system check
* --location [*string*] - location of the file for fileCheck
