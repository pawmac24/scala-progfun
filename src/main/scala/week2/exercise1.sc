//tail recursive version of sum
//https://pl.wikipedia.org/wiki/Rekurencja_ogonowa

def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop(a + 1, f(a) + acc)
  }
  loop(a, 0)
}

sum(x => x * x, 3, 5)
sum(x => x, 3, 5)

//3 * 3 + 4 * 4 + 5 * 5 = 50
//3 + 4 + 5 = 12
