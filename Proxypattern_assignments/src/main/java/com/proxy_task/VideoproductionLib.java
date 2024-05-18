package com.proxy_task;
import java.util.HashMap;

public interface VideoproductionLib {
	HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
