package Demo

object Demo2 {

  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    b -= b
    d -= d


    println(s"--b * a + c *d -- ${b * a + c * d}")

    a += a
    println(s"a++ ${a}")


    //  println (–2 * ( g – k ) +c) g??

    c += c
    println(s"c = c++ -> ${c}")
    c += c
    a += a

    println(s"c=++c*a++ -> ${c * a}");

  }
}
