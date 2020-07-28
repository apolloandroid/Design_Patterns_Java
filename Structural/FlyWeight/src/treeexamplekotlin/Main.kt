package treeexamplekotlin

import treeexamplejava.Main
import treeexamplejava.forest.Forest
import java.awt.Color
import kotlin.math.floor

object Main {
    private const val CANVAS_SIZE = 500
    private const val TREES_TO_DRAW = 1000000
    private const val TREE_TYPES = 2

    @JvmStatic
    fun main(args: Array<String>) {
        val forest = Forest()
        plantForest(forest)
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE)
        forest.isVisible = true
    }

    private fun plantForest(forest: Forest) {
        for (i in 0..floor((TREES_TO_DRAW / TREE_TYPES).toDouble()).toInt()) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub")
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub")
        }
    }

    private fun random(min: Int, max: Int): Int = min + (Math.random() * ((max - min) + 1)).toInt()
    private fun printLogs() {
        println("$TREES_TO_DRAW treeexamplejava.trees drawn")
        println("---------------------")
        println("Memory usage:")
        println("Tree size (8 bytes) * $TREES_TO_DRAW")
        println("+ TreeTypes size (~30 bytes) * $TREE_TYPES")
        println("---------------------")
        println("Total: " + (TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024 +
                "MB (instead of " + TREES_TO_DRAW * 38 / 1024 / 1024 + "MB)")
    }
}