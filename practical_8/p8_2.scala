package p8

import scala.io.StdIn

object p8_2 {

  def main(args: Array[String]): Unit = {

    println("please enter an integer")

    val input: Int = try{StdIn.readInt()}
    catch {
      case _: NumberFormatException => println("invalid input")
        return
    }

    val message = (isMultipleOfThree(input), isMultipleOfFive(input)) match {
      case (true, true) => "Multiple of Both Three and Five"
      case (true, false) => "Multiple of Three"
      case (false, true) => "Multiple of Five"
      case (false, false) => "Not a Multiple of Three or Five"
    }

    println(f"${message}")

  }



  val isMultipleOfThree: Int => Boolean = _ % 3 == 0


  val isMultipleOfFive: Int => Boolean = _ % 5 == 0


}