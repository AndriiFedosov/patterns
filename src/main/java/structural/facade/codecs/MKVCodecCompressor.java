package structural.facade.codecs;

import lombok.Data;
import structural.facade.VideoType;

@Data
public class MKVCodecCompressor implements Codec {
    private VideoType type = VideoType.MKV;
}
