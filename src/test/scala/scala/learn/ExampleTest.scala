package scala.learn

import org.scalatest.FunSuite

object ExampleTest extends FunSuite {

  test("Example"){
    assert(Example.cube(5) == 125)
  }
}
