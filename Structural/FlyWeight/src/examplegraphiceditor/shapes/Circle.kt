package examplegraphiceditor.shapes

import examplegraphiceditor.Context

class Circle(private val radius: Int) : Primitive {
    override fun draw(context: Context) {
        println("Circle draw")
    }
}