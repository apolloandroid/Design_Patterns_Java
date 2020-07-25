package exampleshape

import exampleshape.drawer.LargeCircleDrawer
import exampleshape.drawer.SmallCircleDrawer
import exampleshape.shape.Circle

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val shapes = arrayOf(Circle(1, 1, 2.0, SmallCircleDrawer()),
                Circle(3, 2, 4.0, LargeCircleDrawer()))
        drawShapes(shapes)
    }

    fun drawShapes(shapes: Array<Circle>) {
        for (shape in shapes) shape.draw()
    }
}