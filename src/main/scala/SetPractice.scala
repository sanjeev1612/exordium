object SetPractice extends App {
  val fruits: Set[String] = Set("apple", "bananna", "pear")
  val flatMap: Set[Char] = fruits.flatMap(a => a.toUpperCase)
  println(flatMap)
  val s: Set[Int] = (1 to 6).toSet
  val newS = s map (_ + 2)
  newS.foreach(print)
}
