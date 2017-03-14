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
  
  test("P04 given case") {
    assert(P04(3,7,List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) === List('d, 'e, 'f, 'g))
  }
  
  test("P04 empty list") {
    assert(P04(0,0,List()) === List())
  }
  
  test("P04 Int list") {
    assert(P04(2,4,List(1,2,3,4,45,3)) === List(3,4))
  }
  
  test("P04 Starting at 0") {
    assert(P04(0, 3, List('a, 'b, 'c, 'd)) === List('a, 'b, 'c))
  }
  
  test("P04 going to last element") {
    assert(P04(1,3,List(0,1,2)) === List(1,2))
  }
  
  test("P04 one element") {
    assert(P04(0,1, List("test")) === List("test"))
  }
  
  test("P04 nested lists") {
    assert(P04(1,3,List(List(1,2),List('a,'b),List(List(1,2),List(2,3)), List("test"), List('a,'b))) === List(List('a,'b), List(List(1,2),List(2,3))))
  }
  
  test("P04 error cases") {
    assert(P04(-1,2,List(1,2,3,4)) === List())
    assert(P04(1,5,List(1,2,3,4)) === List())
    assert(P04(1,1,List(1,2,3,4)) === List())
    assert(P04(2,1,List(1,2,3,4)) === List())
  }
}

 	