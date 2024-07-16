package Demo.p5

import scala.collection.mutable
case class Book(title : String,author : String, isbn: String)



object LibraryManager {
  // Mutable set
  private val books: mutable.Set[Book] = mutable.Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "2345678901"),
    Book("The Great Gatsby", "F. Scott Fitzgerald", "3456789012")
  )

  // add new book
  def addBook(book: Book): Unit = {
    if (books.exists(_.isbn == book.isbn)) {
      println(s"The book with ISBN ${book.isbn} already exists.")
    } else {
      books += book
      println(s"Book '${book.title}' by ${book.author} added to the library.")
    }
  }

  // isbn remove book
  def removeBook(isbn: String): Unit = {
    books.find(_.isbn == isbn) match {
      case Some(book) =>
        books -= book
        println(s"Book '${book.title}' by ${book.author} removed from the library.")
      case None =>
        println(s"No book found with ISBN $isbn.")
    }
  }

  // isbn search for book
  def checkBook(isbn: String): Boolean = {
    books.exists(_.isbn == isbn)
  }

  // current library
  def displayLibrary(): Unit = {
    if (books.isEmpty) {
      println("The library is empty.")
    } else {
      println("Current library collection:")
      books.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
    }
  }

  // search title
  def searchByTitle(title: String): Unit = {
    books.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title '$title'.")
    }
  }

  // display by author
  def displayBooksByAuthor(author: String): Unit = {
    val authorBooks = books.filter(_.author.equalsIgnoreCase(author))
    if (authorBooks.isEmpty) {
      println(s"No books found by author '$author'.")
    } else {
      println(s"Books by $author:")
      authorBooks.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    }
  }

  def main(args: Array[String]): Unit = {

    LibraryManager.addBook(Book("data structures","jenny","6712892"))
    LibraryManager.displayLibrary()
    LibraryManager.removeBook("6712892")
    LibraryManager.displayLibrary()
    println(LibraryManager.checkBook("6712892"))
    LibraryManager.searchByTitle("To kill a mockingbird")
    LibraryManager.displayBooksByAuthor("Harper Lee")

  }
}

