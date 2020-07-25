package examplewebpage.webpage

import examplewebpage.theme.Theme

interface WebPage {
    var theme: Theme
    fun printKind()
}

class About(override var theme: Theme) : WebPage {
    override fun printKind() {
        println("About" + theme.printColor())
    }
}

class Career(override var theme: Theme) : WebPage {
    override fun printKind() {
        println("Career" + theme.printColor())
    }
}

class Project(override var theme: Theme) : WebPage {
    override fun printKind() {
        println("Project" + theme.printColor())
    }
}