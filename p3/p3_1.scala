package Demo.p3

object p3_1 {
  def main(args: Array[String]): Unit = {


    // Example usage:
    val originalString = "Hello"
    val reversedString = reverseString(originalString)
    println(reversedString)


  }

  def reverseString(s: String): String = {
    if (s.isEmpty) ""
    else reverseString(s.tail) + s.head
  }
}
