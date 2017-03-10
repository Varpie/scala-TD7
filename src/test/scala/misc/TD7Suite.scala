package misc

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class implements a ScalaTest test suite for the methods in object `Insertion` that need to be implemented as part of
 * this assignment. A test suite is simply a collection of individual tests for some specific component of a program.
 *
 * A test suite is created by defining a class which extends the type `org.scalatest.FunSuite`. When running ScalaTest, it
 * will automatically find this class and execute all of its tests.
 *
 * Adding the `@RunWith` annotation enables the test suite to be executed inside eclipse using the built-in JUnit test runner.
 *
 * You have two options for running this test suite:
 *
 * - Right-click this file in eclipse and chose "Run As" - "JUnit Test"
 */

@RunWith(classOf[JUnitRunner])
class TD7Suite extends FunSuite {

  import TD7._

}

 	