//import week3.{Example, Rational}
import week3._

object scratch{
  new Rational(1, 2)
  val ex = new Example
  val sum = ex.add(1, 2)

  def error(msg: String) = throw new Error(msg)
  //error("test")

  val x = null //x: Null
  val y: String = null //y: String
  //val z: Int = null //error: type mismatch

  if (true) 1 else false
}
