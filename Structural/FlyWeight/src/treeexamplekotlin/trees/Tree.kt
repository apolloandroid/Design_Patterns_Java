package treeexamplekotlin.trees

import java.awt.Graphics


data class Tree(var x: Int, var y: Int, var treeType: TreeType) {
    fun draw(graphics: Graphics) {
        treeType.draw(x, y, graphics)
    }
}