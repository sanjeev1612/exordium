import scala.collection.immutable.SortedMap

type Occurrences = List[(Char, Int)]
type Word = String



def wordOccurrences(w: Word): Occurrences = {
  val unsorted = (w.toLowerCase groupBy identity) map { case (c, cs) => (c, cs.length) }

  (SortedMap[Char, Int]() ++ unsorted) toList
}

wordOccurrences("sanjeevdd")

val k = "sanjeevdd" groupBy (_.self)