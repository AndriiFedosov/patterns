package structural.facade.services;

import lombok.extern.slf4j.Slf4j;
import structural.facade.VideoFile;

import java.io.IOException;


@Slf4j
public class AudioService {
    public static VideoFile fix(VideoFile result, String path) throws IOException {
        log.info("Audio service fix audio in file: [{}] ", result.getName());
        return result;
    }
}
