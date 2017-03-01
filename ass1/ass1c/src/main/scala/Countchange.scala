package change

trait CountChange {
  def countChangeOld(amount: Int, denom: List[Int]): Int = {

    def helper(denoms: List[Int], count: Int, amt: Int): Int = {

      if(amt < 0) return 0
      if(amt == 0) return 1

      if(count <= 0 && amt >= 1) return 0

      println(denoms.toString + " " + count +" "+ amt)
      helper(denoms, count - 1, amt) + helper(denoms, count, amt - denoms(count - 1))
    }
    helper(denom, denom.length, amount)
  }

  def countChange(amount: Int, denom: List[Int]): Int = {

    def helper(denoms: List[Int], amt: Int): Int = {

      if(amt < 0) return 0
      if(amt == 0) return 1

      if(denoms.isEmpty && amt >= 1) return 0

    //  println(denoms.toString + " " + count +" "+ amt)
      helper(denoms.init, amt) + helper(denoms, amt - denoms.last)
    }
    helper(denom, amount)
  }
}

object CountChange extends CountChange
