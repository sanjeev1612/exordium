abstract class IntSet {
  def inc(mem: Int): IntSet

  def contains(x: Int): Boolean
}

object EmptySet extends IntSet {
  override def contains(x: Int): Boolean = false

  override def inc(mem: Int) = new NonEmptySet(mem, EmptySet, EmptySet)

  override def toString: String = "."
}

case class NonEmptySet(mem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def inc(x: Int): IntSet = {
    if (x < mem) new NonEmptySet(mem, left inc x, right)
    else if (x > mem) new NonEmptySet(mem, left, right inc x)
    else this
  }

  override def contains(x: Int): Boolean = {
    if (x < mem) left contains x
    else if (x > mem) right contains x
    else true
  }

  override def toString: String = {
    "{" + left + mem + right + "}"
  }
}

