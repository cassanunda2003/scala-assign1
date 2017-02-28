package brackets

trait Brackets {

  def isBalanced(bracketString: String): Boolean = {
    def accumulator(bracketsCount: Int, bracket: String) : Int = {
      bracket.headOption match {
        case None => bracketsCount
        case Some('(') => accumulator(bracketsCount + 1, bracket.tail)
        case Some(')') => accumulator(bracketsCount - 1, bracket.tail)
        case Some(_) => accumulator(bracketsCount, bracket.tail)
      }
    }
    accumulator(0, bracketString) == 0
  }

}

object Brackets extends Brackets
