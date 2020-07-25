package authorexample

import authorexample.authors.Author
import authorexample.authors.FairyTaleAuthor
import authorexample.authors.ThrillerAuthor

class Main {


    companion object {
        lateinit var author: Author
        @JvmStatic
        fun main(args: Array<String>) {
            val mainGenre = readLine()
            val title = readLine()
            configAuthor(mainGenre)
            author.createBook(title)
            author.publishBook()

        }

        private fun configAuthor(mainGenre: String?) = when (mainGenre) {
            "Thriller" -> author = ThrillerAuthor("King")
            else -> author = FairyTaleAuthor("Andersen")
        }

    }
}