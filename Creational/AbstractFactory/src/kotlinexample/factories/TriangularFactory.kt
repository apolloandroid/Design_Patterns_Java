package kotlinexample.factories

import kotlinexample.chairs.TriangularChair
import kotlinexample.tables.TriangularTable

class TriangularFactory : Factory {
    override fun createChair() = TriangularChair()

    override fun createTable() = TriangularTable()
}