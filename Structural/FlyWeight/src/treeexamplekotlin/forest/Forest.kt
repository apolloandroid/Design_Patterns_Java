package treeexamplekotlin.forest

import treeexamplekotlin.trees.Tree
import treeexamplekotlin.trees.TreeFactory
import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame

class Forest : JFrame() {
    private val trees = ArrayList<Tree>()
    fun plantTree(x: Int, y: Int, name: String, color: Color, otherTreeData: String) {
        val treeType = TreeFactory.getTreeType(name, color, otherTreeData)
        val tree = Tree(x, y, treeType)
        trees.add(tree)
    }

    override fun paint(graphics: Graphics) {
        for (tree in trees) {
            tree.draw(graphics)
        }
    }
}