package authorexample.authors

import authorexample.books.Thriller

class ThrillerAuthor(name: String) : Author(name) {
    override val mainGenre = "Thriller"

    override fun createBook(title: String?) {
        booksList.add(Thriller(this, title))
    }

    override fun publishBook() {
        with(booksList[0]) {
            printAuthorName()
            printTitle()
            printGenre()
        }
    }
}