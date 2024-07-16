package Demo.p5

object p5_1 {
  def main(args: Array[String]): Unit = {
    var products = getProductList()
    printProductList(products)
    println("NO. of products => " + getTotalProducts(products))

  }


  def getProductList(): List[String] = {
    var products = List[String]()
    var input = ""

    println("enter products => enter 'done' to stop ")
    while(input.toLowerCase() != "done"){
      input = scala.io.StdIn.readLine()
      if(input.toLowerCase() != "done" && !products.contains(input)){
        products = products :+ input
      }
    }
    products
  }

  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(products: List[String]) : Int = {
    products.length
  }




}