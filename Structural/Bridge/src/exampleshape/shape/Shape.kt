package exampleshape.shape

import exampleshape.drawer.Drawer

interface Shape {
    val drawer: Drawer
    fun draw()
    fun enlargeRadius(multiplier: Double)
}

class Circle(private val x: Int, private val y: Int, private var radius: Double, override val drawer: Drawer) : Shape {
    override fun draw() {
        drawer.drawShape(x, y, radius)
    }

    override fun enlargeRadius(multiplier: Double) {
        radius *= multiplier
    }
}