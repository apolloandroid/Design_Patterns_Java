package examplegraphiceditor.shapes

import examplegraphiceditor.Context

class Point : Primitive {
    override fun draw(context: Context) {
        println("Point draw")
    }
}