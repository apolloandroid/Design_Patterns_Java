package examplewebpage.theme

interface Theme {
    fun printColor()
}

class DarkTheme:Theme {
    override fun printColor() {
        println("Dark")
    }
}

class LightTheme:Theme {
    override fun printColor() {
        println("Light")
    }
}class AquaTheme:Theme {
    override fun printColor() {
        println("Aqua")
    }
}