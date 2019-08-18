object BalanceBrackets {
  def balance(chars: List[Char]): Boolean = {
    def innerf(chars: List[Char], numofBrackets: Int): Boolean = {
      if (chars.isEmpty) {
        numofBrackets == 0
      } else {
        val h = chars.head
        val n =
          if (h == '(') numofBrackets + 1
          else if (h == ')') numofBrackets - 1
          else numofBrackets
        if (n >= 0) innerf(chars.tail, n)
        else false

      }
    }

    innerf(chars, 0)
  }
}
