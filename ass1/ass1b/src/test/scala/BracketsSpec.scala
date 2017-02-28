package brackets

import org.scalatest._

class BracksSpec extends FlatSpec with Matchers {

  "A brackets balancer " should " return false " in {
    val testString = "(()"
    Brackets.isBalanced(testString) should be (false)
  }

  it should " return true for a balanced string " in {
    val testString = "(Hello(Mark))"
    Brackets.isBalanced(testString) should be (true)
  }

  it should " return false for a unbalanced string " in {
    val testString = "(Hello(Mark)"
    Brackets.isBalanced(testString) should be (false)
  }
}
