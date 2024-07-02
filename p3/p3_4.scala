package Demo.p3

object p3_4 {
  def main(args: Array[String]): Unit = {
    val list1 = List(1,2,3,4,5)
    println(sum(sumOfEvens(list1)))


  }

  def sumOfEvens(numbers: List[Int]): List[Int] = {
    numbers.filter(_ % 2 == 0)
  }

  def sum(n: List[Int]) : Int = {n.sum}

}
