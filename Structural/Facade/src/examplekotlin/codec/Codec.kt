package examplekotlin.codec

import examplekotlin.VideoFile

interface Codec

class MPEG4CompressionCodec : Codec {
    val type = "mp4"
}

class OggCompressionCodec : Codec {
    val type = "ogg"
}

object CodecFactory {
    fun extract(file: VideoFile): Codec {
        val codecType = file.codectype
        return if (codecType == "mp4") {
            println("CodecFactory: extracting mpeg audio...")
            MPEG4CompressionCodec()
        } else {
            println("CodecFactory: extracting ogg audio...")
            OggCompressionCodec()
        }
    }
}