package examplegraphiceditor

import examplegraphiceditor.shapes.*

class PrimitiveFactory {


    companion object {
        private lateinit var point: Point
        private lateinit var circles: HashMap<Int, Circle?>
        private lateinit var squares: HashMap<Int, Square>

        fun createPoint(context: Context): Point {
            if (point === null) {
                point = Point()
            }
            return point
        }

        fun createCircle(radius: Int): Circle? {
            if (circles[radius] == null) {
                circles[radius] = Circle(radius)
            }
            return circles[radius]
        }

        fun createSquare(width: Int, height: Int): Square? {
            if (squares[width + height] == null) {
                squares[width + height] = Square(width, height)
            }
            return squares[width + height]
        }

//        fun createPicture(vararg children: Primitive): Picture {
//            return Picture(children)
//        }
    }
}