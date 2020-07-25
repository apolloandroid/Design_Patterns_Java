package examplewebpage

import examplewebpage.theme.AquaTheme
import examplewebpage.theme.DarkTheme
import examplewebpage.theme.LightTheme
import examplewebpage.theme.Theme
import examplewebpage.webpage.About
import examplewebpage.webpage.Career
import examplewebpage.webpage.Project
import examplewebpage.webpage.WebPage

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        printPages(DarkTheme())
        println()
        printPages(LightTheme())
        println()
        printPages(AquaTheme())
    }

    private fun printPages(theme: Theme) {
        var page: WebPage = About(theme)
        page.printKind()

        page = Career(theme)
        page.printKind()

        page = Project(theme)
        page.printKind()
    }
}