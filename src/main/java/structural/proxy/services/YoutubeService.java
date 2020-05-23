package structural.proxy.services;

import structural.proxy.Video;

import java.util.HashMap;

public interface YoutubeService {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
