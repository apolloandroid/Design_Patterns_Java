package examplekotlin

interface ShapeComponent {
    var shapes: ArrayList<SimpleShape>

    fun getShapesSize(): Int
    fun addShape(shapeComponent: SimpleShape)
    fun removeShape(shapeComponent: SimpleShape)
    fun drawShape()
}