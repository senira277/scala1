package Demo

object Demo4 {
  def main(args: Array[String]): Unit = {

    var result = profit()
    println(s"profit for ticket price: (${lastPrice})--> ${result}")
  }

  var initialAttendance = 120
  var initialPrice = 15
  var lastPrice = 20
  var performances = 1
//  def relationship(price : Double, )

  def profit(): Double = {
    return ((lastPrice * (newAttendance(initialAttendance,changeOfAttendance(lastPrice,initialPrice)))) - totalCost(performanceCost(performances),attendanceCost(newAttendance(initialAttendance,changeOfAttendanceCost(lastPrice,initialPrice)))))
  }



  def changeOfAttendance(newPrice: Double,oldPrice: Double) :Double = {
    return (oldPrice - newPrice)*4
  }

  def newAttendance(initial : Double, changeofAttendance: Double ) : Double = {
    return initial + changeofAttendance
  }

  def performanceCost(n:Int ) : Double = {
    return n*500
  }

  def changeOfAttendanceCost(n:Double, x : Double) : Double = {
    return (n + x) * 3
  }

  def attendanceCost(n: Double): Double = {
    return n  * 3
  }

  def totalCost(n: Double, m: Double): Double ={
    return (n + m)
  }
}
