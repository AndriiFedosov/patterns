package structural.facade;

import lombok.extern.slf4j.Slf4j;
import structural.facade.codecs.Codec;
import structural.facade.services.AudioService;
import structural.facade.services.BitrateService;
import structural.facade.services.CodecExtractor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class VideoConverterFacade {

    public static Path convertVideo(String name, String newFormat, String path) throws IOException {
        log.info("Video [{}] will be converted in new format :[{}]", name, newFormat);
        VideoFile currentVideo = new VideoFile(name);
        Codec currentCodec = CodecExtractor.extract(currentVideo.getType());
        Codec nextCodec = CodecExtractor.extract(VideoType.valueOf(newFormat.toUpperCase()));
        BitrateService.read(currentVideo, currentCodec);
        BitrateService.write(currentVideo, nextCodec);
        AudioService.fix(currentVideo, path);
        log.info("Video converter finished job, new file :[{}] was converted in new format :[{}]", currentVideo.getName(), newFormat);
        return Files.createFile(Paths.get(path + "/" + currentVideo.getName()));
    }
}
