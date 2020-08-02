package examplegraphiceditor

class Circle(private val radius: Int) : Primitive {
    override fun draw(context: Context) {
        println("Circle draw")
    }
}