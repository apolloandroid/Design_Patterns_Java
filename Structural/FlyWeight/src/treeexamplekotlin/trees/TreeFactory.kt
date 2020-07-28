package treeexamplekotlin.trees

import java.awt.Color

class TreeFactory {
    companion object {
        private val treeTypes: HashMap<String, TreeType?> = HashMap()
        fun getTreeType(name: String, color: Color, otherTreeData: String): TreeType {
            var result: TreeType? = treeTypes[name]
            if (result == null) {
                result = TreeType(name, color, otherTreeData)
                treeTypes[name] = result
            }
            return result
        }
    }
}