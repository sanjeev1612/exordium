object FuncPgm  extends App{
  def sum(a: Int, b: Int)(implicit f: Int => Int): Int = {
    if (a > b) 0 else {
      f(a) + sum(a + 1, b)(f)
    }
  }


  println(sum(1,5))


  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else {
      f(a) * product(f)(a + 1, b)
    }
  }
  println(product((x:Int)=>x)(1,5))

}
