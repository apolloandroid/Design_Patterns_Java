package authorexample.books

import authorexample.authors.Author
import kotlin.concurrent.timer

abstract class Book(author: Author, private val title: String?) {
    private val authorName: String = author.name
    private val genre: String = author.mainGenre

    fun printAuthorName() {
        println(authorName)
    }

    fun printGenre() {
        println(genre)
    }

    fun printTitle() {
        println(title)
    }
}