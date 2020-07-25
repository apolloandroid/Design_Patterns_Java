package examplekotlin

import examplekotlin.codec.CodecFactory
import examplekotlin.codec.MPEG4CompressionCodec
import examplekotlin.codec.OggCompressionCodec
import java.io.File

object VideoConversionFacade {
    fun convertVideo(fileName: String, format: String): File {
        println("VideoConversionFacade: conversion started.")
        val videoFile = VideoFile(fileName)
        val sourceCodec = CodecFactory.extract(videoFile)
        val destinationCodec = when (format) {
            "mp4" -> OggCompressionCodec()
            else -> MPEG4CompressionCodec()
        }
        val buffer = BitrateReader.read(videoFile, sourceCodec)
        val intermediateResult = BitrateReader.convert(buffer, destinationCodec)
        val result: File = AudioMixer.fix(intermediateResult)
        println("VideoConversionFacade: conversion completed.")
        return result
    }
}