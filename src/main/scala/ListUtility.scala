object ListUtility {

  def first[T](xs: List[T]): T = xs match {
    case Nil => throw new Error("Nil.first")
    case List(x) => x
    case y :: ys => y

  }

  def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
    case Nil => ys
    case z :: zs => z :: concat(zs, ys)

  }

  def reverse[T](xs : List[T]): List[T]= xs match {
    case Nil =>xs
    case y :: ys => reverse(ys) ++ List(y)
  }


  def main(args: Array[String]): Unit = {
    val testList = List(1, 2, 3)
    assert(first(testList) == testList.head, "implemented")
    val k= List() == Nil
    println(k)
  }

}
