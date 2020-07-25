package kotlinexample

import kotlinexample.chairs.Chair
import kotlinexample.factories.Factory
import kotlinexample.factories.RoundFactory
import kotlinexample.factories.TriangularFactory
import kotlinexample.tables.Table


object Main {
    private lateinit var table: Table
    private lateinit var chair: Chair

    @JvmStatic
    fun main(args: Array<String>) {
        val factoryName = readLine()
        val factory = getFactory(factoryName)
        createFurniture(factory)
        printFurnitureNames()
    }

    private fun getFactory(factoryName: String?) = when (factoryName) {
        "Circle" -> RoundFactory()
        "Triangle" -> TriangularFactory()
        else -> null
    }

    private fun createFurniture(factory: Factory?) {
        chair = factory!!.createChair()
        table = factory!!.createTable()
    }

    private fun printFurnitureNames() {
        chair.printChairName()
        table.printTableName()
    }
}