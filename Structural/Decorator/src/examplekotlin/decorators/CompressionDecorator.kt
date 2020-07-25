package examplekotlin.decorators

import examplejava.datasource.DataSource
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.util.*
import java.util.zip.Deflater
import java.util.zip.DeflaterOutputStream
import java.util.zip.InflaterInputStream

class CompressionDecorator(wrappee: DataSource) : DataSourceDecorator(wrappee) {
    var compressionLevel: Int = 0

    override fun writeData(data: String?) {
        super.writeData(data)
    }

    override fun readData(): String {
        return super.readData()
    }

    private fun compress(stringData: String): String? {
        val data: ByteArray = stringData.toByteArray()
        val bout = ByteArrayOutputStream(512)
        val dos = DeflaterOutputStream(bout, Deflater(compressionLevel))
        dos.write(data)
        dos.close()
        bout.close()
        return Base64.getEncoder().encodeToString(bout.toByteArray())
    }

    private fun decompress(stringData: String): String {
        val data = Base64.getDecoder().decode(stringData)
        val inputStream = ByteArrayInputStream(data)
        val inflaterInputStream = InflaterInputStream(inputStream)
        val bout = ByteArrayOutputStream(512)
        var b = inflaterInputStream.read()
        while (b != -1) {
            bout.write(b)
        }
        inputStream.close()
        inflaterInputStream.close()
        return String(bout.toByteArray())
    }
}