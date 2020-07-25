package examplekotlin.datasource

import java.io.*

class FileDataSource constructor(val name: String) : DataSource {
    override fun writeData(data: String) {
        val file = File(name)
        FileOutputStream(file).use { writer ->
            writer.write(data.toByteArray(), 0, data.length)
        }
    }

    override fun readData() :String?{
        val buffer: CharArray? = null
        val file = File(name)
        FileReader(file).use { reader ->
            reader.read(buffer)
        }
        return null
    }
}