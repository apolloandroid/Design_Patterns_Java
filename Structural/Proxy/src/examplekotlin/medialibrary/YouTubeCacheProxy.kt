package examplekotlin.medialibrary

import java.util.*

class YouTubeCacheProxy : YouTubeLibrary {
    private val youTubeLibrary: YouTubeLibrary = YouTubeClass()
    private var cachePopularVideos = HashMap<String, Video>()
    private val cacheAll = HashMap<String, Video>()

    override fun popularVideos(): HashMap<String, Video>{
        if (cachePopularVideos.isEmpty()){
            cachePopularVideos = youTubeLibrary.popularVideos()!!
        }
        else    {
            println("Retrieved list from cache")
        }
        return cachePopularVideos
    }

    override fun getVideo(videoId: String): Video {
        var video: Video? = cacheAll[videoId]
        if (video == null) {
            video = youTubeLibrary.getVideo(videoId)
            cacheAll[videoId] = video
        } else {
            println("Retrieved video '$videoId' from cache.")
        }
        return video
    }


}