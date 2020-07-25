package furnitureexample

import furnitureexample.chairs.Chair
import furnitureexample.factories.Factory
import furnitureexample.factories.RoundFactory
import furnitureexample.factories.TriangularFactory
import furnitureexample.tables.Table
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object Main {
    private var chair: Chair? = null
    private var table: Table? = null
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val factoryName = factoryName
        val factory = getFactory(factoryName)
        createFurniture(factory)
        printFurnitureNames()
    }

    @get:Throws(IOException::class)
    private val factoryName: String
        private get() {
            val factoryName: String
            val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
            factoryName = bufferedReader.readLine()
            return factoryName
        }

    private fun getFactory(factoryName: String) = when (factoryName) {
        "Circle" -> RoundFactory()
        "Triangle" -> TriangularFactory()
        else -> null
    }

    private fun createFurniture(factory: Factory?) {
        chair = factory!!.createChair()
        table = factory.createTable()
    }

    private fun printFurnitureNames() {
        chair!!.printChairName()
        table!!.printTableName()
    }
}