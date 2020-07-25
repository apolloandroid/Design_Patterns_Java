package examplekotlin.datasource

interface DataSource {
    fun writeData(data: String)
    fun readData():String?
}