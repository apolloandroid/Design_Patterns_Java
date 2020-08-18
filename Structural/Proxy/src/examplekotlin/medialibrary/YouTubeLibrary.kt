package examplekotlin.medialibrary

import java.util.HashMap

interface YouTubeLibrary {
    fun popularVideos(): HashMap<String, Video>
    fun getVideo(videoId: String): Video
}