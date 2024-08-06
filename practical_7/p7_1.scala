package P7

object p7_1 {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = filterEvenNumbers(numbers)
    val result2 = calculateSquare(numbers)
    val result3 = filterPrime(numbers)
    println("Even numbers => " + result)
    println("square numbers => " + result2)
    println("prime numbers => " + result3)


  }

  def filterEvenNumbers(numbers : List[Int]):List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def calculateSquare(numbers : List[Int]) : List [Int] = {
    numbers.map(num => num* num)
  }

  def is_prime(n: Int): Boolean = {

    if (n <= 1) false
    else if ( n == 3 ) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) {
          false
        }
        i += 6

      }
      true
    }

  }

  def filterPrime (numbers: List[Int]) : List[Int] = {
    numbers.filter(num => is_prime(num))
  }



}
