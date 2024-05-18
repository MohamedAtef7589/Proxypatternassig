package com.proxy_task;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VideoProductionDownloader naiveDownloader = new VideoProductionDownloader(new VideoProductionClass());
	        VideoProductionDownloader smartDownloader = new VideoProductionDownloader(new VideoProductionClass());

	        long naive = test(naiveDownloader);
	        long smart = test(smartDownloader);
	        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

	    }

	    private static long test(VideoProductionDownloader downloader) {
	        long startTime = System.currentTimeMillis();

	        // User behavior in our app:
	        downloader.renderPopularVideos();
	        downloader.renderVideoPage("catzzzzzzzzz");
	        downloader.renderPopularVideos();
	        downloader.renderVideoPage("dancesvideoo");
	        // Users might visit the same page quite often.
	        downloader.renderVideoPage("catzzzzzzzzz");
	        downloader.renderVideoPage("someothervid");

	        long estimatedTime = System.currentTimeMillis() - startTime;
	        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
	        return estimatedTime;
	    }
	}


