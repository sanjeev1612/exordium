object CountChange {

  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0 || coins.isEmpty) 0
    else {
      if (money == 0) 1 else {
        countChange(money - coins.head, coins) + countChange(money, coins.tail)
      }
    }
  }

}
