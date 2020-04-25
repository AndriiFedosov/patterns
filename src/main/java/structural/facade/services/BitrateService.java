package structural.facade.services;

import lombok.extern.slf4j.Slf4j;
import structural.facade.VideoFile;
import structural.facade.codecs.Codec;

@Slf4j
public class BitrateService {

    public static VideoFile read(VideoFile file, Codec codec) {
        log.info("Bitrate service reading file: [{}] in format [{}]",
                file.getName(), codec.getType().name().toLowerCase());
        return file;
    }

    public static VideoFile write(VideoFile file, Codec codec) {
        log.info("Bitrate service write file: [{}] in new format [{}]",
                file.getName(), codec.getType().name().toLowerCase());
        String filename = file.getName().substring(0, file.getName().indexOf("."));
        file.setName(filename + "." + codec.getType().name().toLowerCase());
        return file;
    }
}
