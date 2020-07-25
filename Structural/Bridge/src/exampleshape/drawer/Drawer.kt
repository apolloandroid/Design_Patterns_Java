package exampleshape.drawer

interface Drawer {
    val multiplier: Double
    fun drawShape(x: Int, y: Int, radius: Double) {
        println("Small circle center = $x, $y, radius = ${radius * multiplier}")
    }
}

class SmallCircleDrawer() : Drawer {
    override val multiplier = 0.25
}

class LargeCircleDrawer() : Drawer {
    override val multiplier = 10.0
}