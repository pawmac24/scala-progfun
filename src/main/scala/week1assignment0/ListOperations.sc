object ListOperations{

  def sum(xs: List[Int]): Int = {
    if(xs.isEmpty) 0
    else xs.head + sum(xs.tail)
  }

  sum(List(1, 2, 3))

  def max(xs: List[Int]): Int = {
    def greater(x: Int, y: Int): Int = if (x > y) x else y

    if (xs.isEmpty) throw new java.util.NoSuchElementException
    if (xs.length == 1)
      xs.head
    else
      greater(xs.head, max(xs.tail))
  }

  max(List(6, 8, -102, 9, 5))
  max(List())
}