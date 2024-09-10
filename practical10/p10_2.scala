package p10

object p10_2 {
  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator cannot be zero")


    private val gcdValue: Int = gcd(n.abs, d.abs)
    val numerator: Int = n / gcdValue
    val denominator: Int = d / gcdValue


    def neg: Rational = new Rational(-numerator, denominator)

    def sub(that: Rational): Rational = {
      val newNumerator = this.numerator * that.denominator - that.numerator * this.denominator
      val newDenominator = this.denominator * that.denominator
      new Rational(newNumerator, newDenominator)
    }

    override def toString: String = numerator + "/" + denominator

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4) // 3/4
    val y = new Rational(5, 8) // 5/8
    val z = new Rational(2, 7) // 2/7

    // Calculate y - z
    val result = y.sub(z) // 5/8 - 2/7
    println(s"y - z = $result") // Output: 19/56

    // Now calculate x - (y - z)
    val finalResult = x.sub(result)
    println(s"x - (y - z) = $finalResult") // Output: 149/224
  }


}
