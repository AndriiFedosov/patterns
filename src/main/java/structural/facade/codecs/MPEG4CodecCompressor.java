package structural.facade.codecs;

import lombok.Data;
import structural.facade.VideoType;

@Data
public class MPEG4CodecCompressor implements Codec{
    private VideoType type = VideoType.MP4;
}
