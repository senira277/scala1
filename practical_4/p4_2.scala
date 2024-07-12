package Demo.p4

object p4_2 {
  def main(args: Array[String]): Unit = {

    println(matchPattern(0))

  }

  def matchPattern(x : Int) : String = x match {
    case x if  x < 0 => "negative"
    case  0 => "zero"
    case x if ((x % 2) == 0) => "even"
    case x if ((x % 2) != 0) => "odd"

  }

}
