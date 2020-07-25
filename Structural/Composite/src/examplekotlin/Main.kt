package examplekotlin

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val compoundShape = CompoundShape()
        compoundShape.addShape(Circle())
        compoundShape.addShape(Rectangle())
        compoundShape.drawShape()
        println()
        val circle = Circle()
        val rectangle = Rectangle()
        circle.drawShape()
        rectangle.drawShape()
        println()
        compoundShape.addShape(circle)
        compoundShape.addShape(rectangle)
        compoundShape.drawShape()
    }
}