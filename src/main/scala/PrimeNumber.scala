object PrimeNumber extends App {
  def isPrime(num: Int): Boolean = (2 to num).filter(num % _ == 0).size == 0

  println("testing for 5 " + isPrime(5))
  println("testing for 6 " + isPrime(6))

}
