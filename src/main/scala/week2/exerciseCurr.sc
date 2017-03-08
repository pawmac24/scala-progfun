object exerciseCurr {
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b)

  product(x => x * x)(3, 4) //16 * 9 = 144
  product(x => x)(1, 5) //1 * 2 * 3 * 4 * 5 = 120
  product(x => x * x)(1, 5)

  def fact(n: Int) = product(x => x)(1, n)

  fact(5) //120
}