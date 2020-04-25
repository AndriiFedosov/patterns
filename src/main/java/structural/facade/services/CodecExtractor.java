package structural.facade.services;

import lombok.extern.slf4j.Slf4j;
import structural.facade.VideoType;
import structural.facade.codecs.AVICodecCompressor;
import structural.facade.codecs.Codec;
import structural.facade.codecs.MKVCodecCompressor;
import structural.facade.codecs.MPEG4CodecCompressor;

@Slf4j
public class CodecExtractor {

    public static Codec extract(VideoType type) {
        log.info("Extract codec type :[{}]", type.name().toLowerCase());
        switch (type) {
            case AVI: {
                return new AVICodecCompressor();
            }
            case MKV: {
                return new MKVCodecCompressor();
            }
            case MP4: {
                return new MPEG4CodecCompressor();
            }
            default: {
                throw new IllegalArgumentException("Format does not exist");
            }
        }
    }
}
