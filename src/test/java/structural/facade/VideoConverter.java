package structural.facade;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class VideoConverter {

    @BeforeMethod
    public void setUp() throws IOException {
        Files.createDirectories(Paths.get("temp"));
       Files.createFile(Paths.get("temp\\movie.mp4"));
    }

    @AfterMethod
    public void removeFiles() throws IOException {
        FileUtils.deleteDirectory(new File("temp"));
    }

    @Test
    public void should_convert_file() throws IOException {
        //given
        File file = new File("temp/movie.mp4");
        assertThat(file.exists()).isTrue();
        //when
        Path result = VideoConverterFacade.convertVideo("movie.mp4", "avi", "temp");

        //then
        assertThat(result.toString()).isEqualTo("temp\\movie.avi");
        assertThat(Files.exists(result)).isTrue();
    }
}
