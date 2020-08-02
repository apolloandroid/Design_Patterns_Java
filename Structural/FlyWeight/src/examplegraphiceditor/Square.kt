package examplegraphiceditor

class Square(private val width:Int, private val height:Int) : Primitive {
    override fun draw(context: Context) {
        println("Square draw")
    }
}
