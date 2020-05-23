package structural.proxy.services.impl;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import structural.proxy.Video;
import structural.proxy.services.YoutubeService;

import java.util.HashMap;

@Slf4j
@Builder
public class YoutubeServiceImpl implements YoutubeService {
    private static final String LINK = "http://www.youtube.com";

    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer(LINK);
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer(LINK + "/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Simulate connection to server

    private void connectToServer(String server) {
        log.info("Connecting to " + server + "... ");
        experienceNetworkLatency();
        log.info("Connected!" + "\n");
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


    private HashMap<String, Video> getRandomVideos() {
        log.info("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> videos = new HashMap<>();
        videos.put("acts", Video.builder().id(1L).name("acts.mp4").data(new byte[]{1,42,3,4,12,2,24,4,5,3}).build());
        videos.put("cats", Video.builder().id(2L).name("cats.mp4").data(new byte[]{1,42,3,4,12,2,24,4,5,3}).build());
        videos.put("dogs", Video.builder().id(3L).name("dogs.mp4").data(new byte[]{1,42,3,4,12,2,24,4,5,3}).build());
        videos.put("ents", Video.builder().id(4L).name("ents.mp4").data(new byte[]{1,42,3,4,12,2,24,4,5,3}).build());

        log.info("Done!" + "\n");
        return videos;
    }

    private Video getSomeVideo(String videoId) {
        log.info("Downloading video... ");

        experienceNetworkLatency();
        Video video = Video.builder().id(4L).name("ents.mp4").data(new byte[]{1,42,3,4,12,2,24,4,5,3}).build();

        log.info("Done!" + "\n");
        return video;
    }

}
