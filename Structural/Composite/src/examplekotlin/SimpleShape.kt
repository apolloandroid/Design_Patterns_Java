package examplekotlin

import javax.naming.OperationNotSupportedException

abstract class SimpleShape : ShapeComponent {
    override fun drawShape() {

    }
}

class Circle : SimpleShape() {
    override var shapes: ArrayList<SimpleShape>
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun getShapesSize(): Int = 0

    override fun addShape(shapeComponent: SimpleShape) {
        throw OperationNotSupportedException("Operation is not supported")
    }

    override fun removeShape(shapeComponent: SimpleShape) {
        throw OperationNotSupportedException("Operation is not supported")
    }

    override fun drawShape() {
        super.drawShape()
        println("Circle drawn")
    }
}

class Rectangle : SimpleShape() {
    override var shapes: ArrayList<SimpleShape>
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun getShapesSize(): Int = 0

    override fun addShape(shapeComponent: SimpleShape) {
        throw OperationNotSupportedException("Operation is not supported")
    }

    override fun removeShape(shapeComponent: SimpleShape) {
        throw OperationNotSupportedException("Operation is not supported")
    }

    override fun drawShape() {
        super.drawShape()
        println("Rectangle drawn")
    }
}