package examplejava;

import examplejava.codec.Codec;
import examplejava.codec.CodecFactory;
import examplejava.codec.MPEG4CompressionCodec;
import examplejava.codec.OggCompressionCodec;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }
        VideoFile buffer = BitrateReader.read(file);
        VideoFile intermediateResult = BitrateReader.convert(buffer);
        File result = (new AudioMixer()).fix();
        System.out.println("VideoConversionFacade: conversion completed.");
        return result;
    }
}
