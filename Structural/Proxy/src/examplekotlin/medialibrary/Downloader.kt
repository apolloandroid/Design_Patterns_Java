package examplekotlin.medialibrary


class Downloader(private val api: YouTubeLibrary) {
    fun renderVideoPage(videoId: String?) {
        val video = videoId?.let { api.getVideo(it) }
        println("\n-------------------------------")
        println("Video page (imagine fancy HTML)")
        println("ID: " + video?.id)
        println("Title: " + video?.title)
        println("Video: " + video?.data)
        println("-------------------------------\n")
    }

    fun renderPopularVideos() {
        val list = api.popularVideos()
        println("\n-------------------------------")
        println("Most popular videos on YouTube (imagine fancy HTML)")
        for (video in list.values) {
            println("ID: " + video.id + " / Title: " + video.title)
        }
        println("-------------------------------\n")
    }
}