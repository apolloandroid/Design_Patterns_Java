package kotlinexample.factories

import kotlinexample.chairs.RoundChair
import kotlinexample.tables.RoundTable

class RoundFactory : Factory {
    override fun createChair() = RoundChair()
    override fun createTable() = RoundTable()
}