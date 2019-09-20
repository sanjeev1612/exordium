object SumOfDigits {

  def digitalRoot(n: Int): Int = n.toString.toCharArray.map(a=>a intValue()).sum
}