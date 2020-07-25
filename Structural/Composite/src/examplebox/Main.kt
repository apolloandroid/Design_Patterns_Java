package examplebox

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val compoundBox = CompoundBox()
        val box = Box()
        println(compoundBox.getBoxesSize())
        println(box.getBoxesSize())
        println()
        compoundBox.insert(Box())
        compoundBox.insert(Box())
        compoundBox.insert(Box())
        println(compoundBox.getBoxesSize())
        box.insert(Box())
    }
}