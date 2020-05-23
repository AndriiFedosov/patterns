package structural.proxy.services.impl;

import lombok.extern.slf4j.Slf4j;
import structural.proxy.Video;
import structural.proxy.services.Downloader;
import structural.proxy.services.YoutubeService;

import java.util.HashMap;

@Slf4j
public class DownloaderImpl implements Downloader {
    private final YoutubeService apiService;

    public DownloaderImpl(YoutubeService apiService) {
        this.apiService = apiService;
    }


    public void renderVideoPage(String videoId) {
        Video video = apiService.getVideo(videoId);
        log.info("\n-------------------------------");
        log.info("Video page (imagine fancy HTML)");
        log.info("ID: " + video.getId());
        log.info("Title: " + video.getName());
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = apiService.popularVideos();
        log.info("\n-------------------------------");
        log.info("Most popular videos on Youtube (imagine fancy HTML)");
        for (Video video : list.values()) {
            log.info("ID: " + video.getId() + " / Title: " + video.getName());
        }
    }
}
