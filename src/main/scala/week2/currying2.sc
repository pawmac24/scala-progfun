def sum(f: Int => Int)(a: Int, b: Int): Int =
  if (a > b) 0 else f(a) + sum(f)(a + 1, b)

def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

sum(x => x)(1, 10) //55
sum(x => x * x * x)(1, 10) //3025
sum(fact)(1, 10) //10

def cube(x: Int): Int = x * x * x
//sum(cube)(1, 10)
sum(cube)
