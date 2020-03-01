object SumOfDigits {

  def digitalRoot(n: Int): Int = n.toString.toCharArray.map(a=>Integer.parseInt(a.toString)).sum
}