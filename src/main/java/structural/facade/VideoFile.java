package structural.facade;

import lombok.Data;

@Data
public class VideoFile {
    private String name;
    private VideoType type;

    public VideoFile(String name) {
        this.name = name;
        this.type = VideoType.valueOf(name.toUpperCase().substring(name.indexOf(".") + 1));
    }
}
