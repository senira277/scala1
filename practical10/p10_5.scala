package p10

object p10_5 {


    def countLetterOccurrences(words: List[String]): Int = {
      val wordLengths = words.map(_.length)

      wordLengths.reduce(_ + _)
    }

    def main(args: Array[String]): Unit = {
      val words = List("apple", "banana", "cherry", "date")
      val totalLetterCount = countLetterOccurrences(words)
      println(s"Total count of letter occurrences: $totalLetterCount") // Output: 21
    }


}
