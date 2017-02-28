package pascal

import org.scalatest._

class PascalsSpec extends FlatSpec with Matchers {

  "Pascals triangle" should " return 1 " in {
    Pascals.getNumber(1, 1) should be (1)
  }

  it should " return 6 " in {
    Pascals.getNumber(5,3) should be (6)
  }

  it should " return 10 " in {
    Pascals.getNumber(6,3) should be (10)
  }
}
