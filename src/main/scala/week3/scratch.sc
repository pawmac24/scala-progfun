//import week3.{Example, Rational}
import week3._

object scratch{
  new Rational(1, 2)
  val ex = new Example
  val sum = ex.add(1, 2)

  /*
  Nothing is at the bottom of Scala’s type hierarchy.
  It is a subtype of every other type.
  There is no value of type Nothing.
  - To signal abnormal termination
  - As an element type of empty collections
  The type of this expression below is Nothing.
  */
  def error(msg: String) = throw new Error(msg)
  //error("test")

  /*
  Every reference class type also has null as a value.
  The type of null is Null.
  Null is a subtype of every class that inherits from
  Object; it is incompatible with subtypes of AnyVal.
  */

  val x = null //x: Null
  val y: String = null //y: String
  //val z: Int = null //error: type mismatch

  if (true) 1 else false
}
