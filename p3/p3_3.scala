package Demo.p3

object p3_3 {
  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 10

    val ans = average(num1,num2)

    println(ans)

  }


  def average(num1: Int, num2: Int): Double = {
    val sum = num1 + num2
    val sumD = sum.toDouble
    val avg = sumD/2.0

    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

}