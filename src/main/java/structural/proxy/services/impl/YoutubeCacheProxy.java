package structural.proxy.services.impl;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import structural.proxy.Video;
import structural.proxy.services.YoutubeService;

import java.util.HashMap;
import java.util.Objects;

@Slf4j
@Builder
public class YoutubeCacheProxy implements YoutubeService {
    @Builder.Default
    private final YoutubeService youtubeService = new YoutubeServiceImpl();
    @Builder.Default
    private HashMap<String, Video> cachePopular = new HashMap<>();
    @Builder.Default
    private HashMap<String, Video> cacheAll = new HashMap<>();


    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            log.info("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (Objects.isNull(video)) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            log.info("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void resetCache() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
