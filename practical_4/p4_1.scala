package Demo.p4

object p4_1 {
  def main(args: Array[String]): Unit = {

    items(0) = "it1"
    items(1) = "it2"

    quantity(0) = 10
    quantity(1) = 102

    displayInventory(items,quantity)

//    restockItem("it2",10)
//    sellItem("it1",11)



  }

  var items = new Array[String](10)
  var quantity = new Array[Int](10)

  def displayInventory(item: Array[String],quantity: Array[Int]) : Unit = {
    var j: Int = 0
    for(i <- item){
      if(item(j) != null ) {

        println(s"${i} : ${quantity(j)}")
        j += 1
      }
    }
  }

  def restockItem(itemName: String, q : Int) : Unit = {
    var j: Int = 0
    for (i <- items) {
      if (items(j) == itemName) {
        quantity(j) += q
        println("Inventory Updated!")

        displayInventory(items,quantity)
        return
      }
      j += 1
    }
    println("Item not found!")
  }

  def sellItem(itemName: String, q: Int): Unit = {
    var j: Int = 0
    for (i <- items) {
      if (items(j) == itemName) {
        if(quantity(j) >= q) {
          quantity(j) -= q
          println("Item Sold! : Inventory Updated!")

          displayInventory(items, quantity)
          return
        }else{
          println("not enough stock!")
          return
        }

      }
      j += 1
    }

      println("Item not found!")

  }


}
