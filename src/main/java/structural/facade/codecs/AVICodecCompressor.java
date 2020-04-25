package structural.facade.codecs;

import lombok.Data;
import structural.facade.VideoType;

@Data
public class AVICodecCompressor implements Codec {
    private VideoType type = VideoType.AVI;
}
