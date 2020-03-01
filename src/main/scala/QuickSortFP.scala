object QuickSortFP extends App {

  val r = scala.util.Random
  implicit val randomArray = (for (i <- 1 to 1000) yield r.nextInt(10000)).toArray

  val sortedArray: Array[Int] = quickSort
  val listInt = randomArray.toList
  println("Sorted Array through if else is " + java.util.Arrays.toString(sortedArray))
  println("Sorted Array through pattern match is " + quickSort(listInt))

  def quickSort(implicit xs: Array[Int]): Array[Int] = {
    if (xs.length <= 1) xs
    else {
      val pivot = xs(xs.length / 2)
      Array.concat(quickSort(xs filter (pivot >)), xs filter (pivot ==), quickSort(xs filter (pivot <)))
    }
  }

  def quickSort(list: List[Int]): List[Int] = {
    list match {
      case Nil => Nil
      case a :: Nil => List(a)
      case a :: tail => quickSort(tail.filter(x => x <= a)) ::: List(a) ::: quickSort(tail.filter(x => x > a))
    }
  }

  def quickSortC(xs: List[Int]): List[Int] = xs match {
    case Nil => Nil
    case head :: tail => {
      val (low, high) = tail.partition(_ < head)
        quickSortC(low) ::: head :: quickSortC(high)
    }
  }

    def mergeSort(xs: List[Int]): List[Int] = {
        val n = xs.length / 2
        if (n == 0) xs
        else {
            def merge(xs: List[Int], ys: List[Int]): List[Int] =
                (xs, ys) match {
                    case(Nil, ys) => ys
                    case(xs, Nil) => xs
                    case(x :: xs1, y :: ys1) =>
                        if (x < y) x::merge(xs1, ys)
                        else y :: merge(xs, ys1)
                }
            val (left, right) = xs splitAt(n)
            merge(mergeSort(left), mergeSort(right))
        }
    }
}