package Demo.p5

object p5_3 {
  def main(args: Array[String]): Unit = {
    var in = 10;
    print(s"for ${in} =>" + fibonacii(in))
  }


  def fibonacii(n : Int) : Int = {
    if(n <= 1 ) n
    else fibonacii(n-1) + fibonacii((n-2))
  }
}