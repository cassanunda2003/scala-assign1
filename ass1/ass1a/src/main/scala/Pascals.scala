package pascal

trait Pascals {
  def getNumber(row: Int, col: Int): Int = {
    if(col == 1 || col == row)
      1
    else
      getNumber(row -1, col - 1) + getNumber(row - 1, col)
  }
}

object Pascals extends Pascals
