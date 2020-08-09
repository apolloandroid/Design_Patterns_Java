package examplebuttons

// keeps common characteristics
data class ButtonFlyWeight(
        // external
        private val text: String) {
    fun draw() {
        println("$text")
    }
}