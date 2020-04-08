import scala.collection.immutable.SortedMap

type Occurrences = List[(Char, Int)]
type Word = String



def wordOccurrences(w: Word): Occurrences = {
  val unsorted = (w.toLowerCase groupBy identity) map { case (c, cs) => (c, cs.length) }

  (SortedMap[Char, Int]() ++ unsorted) toList
}

wordOccurrences("sanjeevdd")

val k = "sanjeevdd" groupBy (_.self)

val str = "a.b"
val k9 = str.split("[.]")


"ABC".permutations.foreach(println)

val x="allergy".toLowerCase.groupBy(identity).map { case (x, y) => (x, y.length) }

val y="allergic".toLowerCase.groupBy(identity).map { case (x, y) => (x, y.length) }

val m0=x -- y.keySet

val m1=y -- x.keySet

if (m0.size != m1.size) false else true