package structural.proxy;

import com.sun.org.glassfish.gmbal.Description;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;
import structural.proxy.services.Downloader;
import structural.proxy.services.impl.DownloaderImpl;
import structural.proxy.services.impl.YoutubeCacheProxy;
import structural.proxy.services.impl.YoutubeServiceImpl;

@Slf4j
public class ServiceTests {

    @Test
    @Description("Should check video downloader")
    public void test_1() {

        Downloader naiveDownloader = new DownloaderImpl(YoutubeCacheProxy.builder().build());
        Downloader smartDownloader = new DownloaderImpl(YoutubeServiceImpl.builder().build());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
    }
    private static long test(Downloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("acts");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("cats");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("dogs");
        downloader.renderVideoPage("ents");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
