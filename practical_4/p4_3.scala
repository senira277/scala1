package Demo.p4

object p4_3 {
  def main(args: Array[String]): Unit = {

    println(formatNames("Benny",toUpper))
    println(formatNames("Niroshan",cus1))
    println(formatNames("Saman",toLower))
    println(formatNames("Kumara",cus2))


  }
  def toUpper(in: String) : String = {
    in.toUpperCase()
  }

  def toLower(in: String): String = {
    in.toLowerCase()
  }

  def cus1(in : String) : String ={
    in.updated(1,in(1).toUpper)
  }
  def cus2(in : String ) : String = {
    in.updated(5,in(5).toUpper)
  }



  def formatNames(name: String, group : String => String) : String = {
    group(name)
  }
}
