package authorexample.authors

import authorexample.books.FairyTale

class FairyTaleAuthor(name: String) : Author(name) {
    override val mainGenre = "FairyTale"

    override fun createBook(title: String?) {
        booksList.add(FairyTale(this, title))
    }

    override fun publishBook() {
        with(booksList[0]) {
            printAuthorName()
            printTitle()
            printGenre()
        }
    }
}