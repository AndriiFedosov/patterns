package structural.proxy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Video {
    private Long id;
    private String name;
    private byte [] data;
}
