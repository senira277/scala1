package Demo.p3

object p3_2 {
  def main(args: Array[String]): Unit = {
    val inputList = List("jack", "jacob", "umbrella", "dominance", "powerful", "car")
    val filteredList = filterLong(inputList)
    println(filteredList)


  }

  def filterLong(strings : List[String]) : List[String] = {
    strings.filter(_.length > 5)
  }
}
