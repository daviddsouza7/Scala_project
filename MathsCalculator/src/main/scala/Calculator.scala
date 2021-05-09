import scala.io.StdIn.readLine

object Calculator {

  def main(args: Array[String]) =
  {


    println(" Enter 1st Number :")
    val x = scala.io.StdIn.readInt()

    println(" Enter 2nd Number :")
    val y = scala.io.StdIn.readInt()


    println("Addition Is " +addition(x,y))
    println("Subtraction Is " +subtraction(x,y))
    println("Multiplication Is " +multiplication(x,y))
    println("Division Is " +division(x,y))


  }

  def addition(x:Int,y:Int): Int =
  {
    var result:Int=0
    result = x+y
    return result
  }

  def subtraction(x:Int,y:Int): Int =
  {
    var result:Int=0
    result = x-y
    return result
  }

  def multiplication(x:Int,y:Int): Int =
  {
    var result:Int=0
    result = x*y
    return result
  }
  def division(x:Int,y:Int): Int =
  {
    var result:Int=0

        result = x/y
        return result

  }

}
