package examplejava.codec;

import examplejava.VideoFile;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String codecType = file.getCodecType();
        if (codecType.equals("mp4")) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        }
        else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
