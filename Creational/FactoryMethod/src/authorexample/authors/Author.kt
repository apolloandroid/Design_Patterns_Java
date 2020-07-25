package authorexample.authors

import authorexample.books.Book

abstract class Author(var name: String) {
    open val mainGenre: String = ""
    val booksList: ArrayList<Book> = ArrayList()
    abstract fun createBook(title: String?)
    abstract fun publishBook()
}