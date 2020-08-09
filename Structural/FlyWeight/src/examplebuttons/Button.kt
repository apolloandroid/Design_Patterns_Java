package examplebuttons

// Object keeps unique characteristics
data class Button(
        // internal
        private val shape: String,
        private val color: String,
        private val buttonFlyWeight: ButtonFlyWeight
) {
    fun draw() {
        println("button $shape, $color, ${buttonFlyWeight.draw()}")
    }
}