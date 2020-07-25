package examplekotlin.decorators

import examplejava.datasource.DataSource

open class DataSourceDecorator constructor(val wrappee: DataSource) : DataSource {

    override fun writeData(data: String?) {
        wrappee.writeData(data)
    }

    override fun readData(): String {
        return wrappee.readData()
    }
}