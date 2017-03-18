//Classes, objects and traits can inherit from
// at most one class but arbitrary many traits

//A trait is declared like an abstract class,
// just with trait instead of abstract class.
object traits{
  val s1 = new Square(5)
  val surface = s1.surface
}

trait Planar {
  def height: Int
  def width: Int
  def surface = height * width
}

trait Movable {
}

abstract class Shape {
}

class Square(x: Int) extends Shape with Planar with Movable{
  def height: Int = x
  def width: Int = x
}