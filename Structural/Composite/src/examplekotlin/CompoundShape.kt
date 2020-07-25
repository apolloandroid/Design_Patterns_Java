package examplekotlin

class CompoundShape : ShapeComponent {
    override var shapes: ArrayList<SimpleShape> = ArrayList()

    override fun getShapesSize(): Int = shapes.size

    override fun addShape(shapeComponent: SimpleShape) {
        shapes.add(shapeComponent)
    }

    override fun removeShape(shapeComponent: SimpleShape) {
        shapes.remove(shapeComponent)
    }

    override fun drawShape() {
        println("Compound Shape")
        for (shape in shapes) shape.drawShape()
    }
}