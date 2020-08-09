package examplebuttons

object Main {
    private val shapes = arrayOf("Oval", "Circle", "Square", "Triangle")
    private val colors = arrayOf("Red", "Orange", "Blue", "Yellow")

    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 0..20) {
            if (i < 7){
                val button = Button(getRandomShape(), getRandomColor(), ButtonFactory.getButtonFlyWeight("First"))
                button.draw()
            }
            else if (i in 7..13){
                val button = Button(getRandomShape(), getRandomColor(), ButtonFactory.getButtonFlyWeight("Second"))
                button.draw()
            }
            else{
                val button = Button(getRandomShape(), getRandomColor(), ButtonFactory.getButtonFlyWeight("Third"))
                button.draw()
            }

        }
        ButtonFactory.printButtonFlyWeightSize()

    }

    private fun getRandomShape(): String {
        return shapes[(Math.random() * shapes.size).toInt()]
    }

    private fun getRandomColor(): String {
        return colors[(Math.random() * colors.size).toInt()]
    }
}