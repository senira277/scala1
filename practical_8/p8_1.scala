package p8

object p8_1 {

  def main(args: Array[String]): Unit = {
    val text = "yyyyyy"
    val shift = 3
     val result = cipher(text,shift,encrypt)
    println(f"${text} =>>>> ${result}")

    val dec = cipher(result,shift,decrypt)
    println(f"${result} ==> ${dec}")



  }

  def encrypt(input: String,shift : Int) : String ={
    input.map { char =>
      if(char.isLetter) {
        val base = if(char.isUpper) 'A' else 'a'
        ((char - base + shift) % 26 + base).toChar
      }else{
        char
      }
    }
  }

  def decrypt(input: String, shift : Int) : String = {
    encrypt(input,26-shift)
  }

  def cipher(input: String, shift : Int, algo: (String,Int) => String) : String = {
      algo(input,shift);
  }

}


