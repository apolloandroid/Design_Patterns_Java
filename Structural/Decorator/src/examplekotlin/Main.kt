package examplekotlin

import examplejava.datasource.DataSource
import examplejava.datasource.FileDataSource
import examplejava.decorators.EncryptionDecorator
import examplekotlin.decorators.CompressionDecorator
import examplekotlin.decorators.DataSourceDecorator

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        just()
    }

    private fun just() {
        val salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000"
        val encoded: DataSourceDecorator = CompressionDecorator(EncryptionDecorator(FileDataSource("out/OutputDemo.txt")))
        encoded.writeData(salaryRecords)
        val plain: DataSource = FileDataSource("out/OutputDemo.txt")
        println("- Input ----------------")
        println(salaryRecords)
        println("- Encoded --------------")
        println(plain.readData())
        println()
        println("- Decoded --------------")
        println(encoded.readData())
    }
}