package examplejava;

import examplejava.codec.Codec;

public class BitrateReader {
    public static VideoFile read(VideoFile file) {
        System.out.println("BitrateReader: reading file...");
        return file;
    }

    public static VideoFile convert(VideoFile buffer) {
        System.out.println("BitrateReader: writing file...");
        return buffer;
    }
}
