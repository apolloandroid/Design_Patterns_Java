package kotlinexample.factories

import kotlinexample.chairs.Chair
import kotlinexample.tables.Table

interface Factory {
    fun createChair(): Chair
    fun createTable(): Table
}