package Demo

object Demo3 {
  def main(args: Array[String]): Unit = {
      var result = totalIncome(total(40,30),tax(total(30,30)))
      println(s"Take home salary -> normal:40 OT: 30 --> ${result}")
  }

  def normalIncome(normal:Int) : Int = {
    return normal*250
  }

  def otIncome(ot: Int): Int = {
    return ot * 85
  }
  def tax(total: Int) : Double ={
    return total*0.12
  }

  def total(x: Int, y: Int): Int = {
    return ((x*250) + (y*85))
  }

  def totalIncome(x:Int, z:Double) : Double = {
    return (x  - z)
  }
}
