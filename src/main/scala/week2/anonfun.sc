//anonymous function

def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)


def sumInts(a: Int, b: Int) = sum(x => x, a, b)
def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

sum(a => a, 1, 5)
//1 + 2 + 3 + 4 + 5 = 15

sumInts(1, 5)
//1 + 2 + 3 + 4 + 5 = 15

sumCubes(1, 5)
//1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225
