package treeexamplekotlin.trees

import java.awt.Color
import java.awt.Graphics

data class TreeType(var name: String, var color: Color, var otherTreeData: String) {
    fun draw(x: Int, y: Int, graphics: Graphics) {
        graphics.color
        graphics.fillRect(x - 1, y, 3, 5)
        graphics.color = color
        graphics.fillOval(x - 5, y - 10, 10, 10)
    }
}