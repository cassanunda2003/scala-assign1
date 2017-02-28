package change

import org.scalatest._

class CountChangeSpec extends FlatSpec with Matchers {

  "Count change " should " return 5 " in {
    CountChange.countChange(5, List(1,2,3)) should be (5)
  }
  it should " return 3 " in {
    CountChange.countChange(4, List(1,2)) should be (3)
  }

  it should " return 4 " in {
    CountChange.countChange(70,List(10, 5)) should be (3)
  }
}
