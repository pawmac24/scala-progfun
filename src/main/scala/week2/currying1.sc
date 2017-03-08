def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}

def sumInts = sum(x => x)
def sumCubes = sum(x => x * x * x)
def sumFactorials = sum(fact)

def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)

def cube(x: Int): Int = x * x * x


sumInts(1, 5)
//1 + 2 + 3 + 4 + 5 = 15

sumCubes(1, 5)
//1^3 + 2^3 + 3^3 + 4^3 + 5^3 = 225

sumFactorials(1, 10)
//10

sumCubes(1, 10) + sumFactorials(10, 20)
//3036

sum(x => x)(1, 10) //55
sum(x => x * x * x)(1, 10) //3025
sum(fact)(1, 10) //10

sum(cube)(1, 10) //3025
(sum (cube)) (1, 10) //3026
sum(cube)(1, 10) == (sum (cube)) (1, 10)

