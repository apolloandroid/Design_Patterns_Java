package examplegraphiceditor.shapes

import examplegraphiceditor.Context
import java.util.*


class Picture : Primitive {
    private var children: LinkedList<Primitive> = LinkedList()

    fun Picture(vararg primitives: Primitive) {
        children.addAll(listOf(*primitives))
    }

    override fun draw(context: Context) {
        println("Picture draw")
        for (child in children) {
            child.draw(context)
        }
    }
}