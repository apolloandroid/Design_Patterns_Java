package examplejava.medialibrary;

import java.util.HashMap;

public class YouTubeClass implements YouTubeLibrary {
    @Override
    public HashMap<String, Video> popularVideos() {
        return null;
    }

    @Override
    public Video getVideo(String videoId) {
        return null;
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
