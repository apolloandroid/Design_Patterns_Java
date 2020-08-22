package examplekotlin

import examplekotlin.medialibrary.Downloader
import examplekotlin.medialibrary.YouTubeCacheProxy
import examplekotlin.medialibrary.YouTubeClass

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val naiveDownLoader = Downloader(YouTubeClass())
        val smartDownLoader = Downloader(YouTubeCacheProxy())
        val naiveTime = test(naiveDownLoader)
        val smartTime = test(smartDownLoader)
        println("Time saved by caching proxy: ${naiveTime - smartTime} ms")
    }

    private fun test(downloader: Downloader): Long {
        var startTime = System.currentTimeMillis()

        downloader.renderPopularVideos()
        downloader.renderVideoPage("catzzzzzzzzz")
        downloader.renderPopularVideos()
        downloader.renderVideoPage("dancesvideoo")
        downloader.renderVideoPage("catzzzzzzzzz")
        downloader.renderVideoPage("catzzzzzzzzz")

        var estimatedTime = System.currentTimeMillis() - startTime
        println("Time elapsed: $estimatedTime ms")
        return estimatedTime
    }
}