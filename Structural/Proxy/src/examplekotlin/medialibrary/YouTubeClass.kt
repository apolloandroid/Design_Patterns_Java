package examplekotlin.medialibrary

import java.util.HashMap

class YouTubeClass : YouTubeLibrary {
    override fun popularVideos(): HashMap<String, Video> {
        connectToServer("http://www.youtube.com")
        return getRandomVideos()
    }

    override fun getVideo(videoId: String): Video {
        connectToServer("http://www.youtube.com/$videoId")
        return getSomeVideo(videoId)
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.

    private fun random(min: Int, max: Int) = min + (Math.random() * (max - min + 1)).toInt()

    private fun experienceNetWorkLatency() {
        val latency = random(5, 10)
        for (i in 0..latency) {
            try {
                Thread.sleep(100)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }
    }

    private fun connectToServer(server: String) {
        println("Connecting to $server...")
        experienceNetWorkLatency()
        println("Connected!")
    }

    private fun getRandomVideos(): java.util.HashMap<String, Video> {
        println("Downloading populars")
        experienceNetWorkLatency()
        val hmap = java.util.HashMap<String, Video>()
        hmap["catzzzzzzzzz"] = Video("sadgahasgdas", "Catzzzz.avi")
        hmap["mkafksangasj"] = Video("mkafksangasj", "Dog play with ball.mp4")
        hmap["dancesvideoo"] = Video("asdfas3ffasd", "Dancing video.mpq")
        hmap["dlsdk5jfslaf"] = Video("dlsdk5jfslaf", "Barcelona vs RealM.mov")
        hmap["3sdfgsd1j333"] = Video("3sdfgsd1j333", "Programing lesson#1.avi")
        print("""
    Done!
    
    """.trimIndent())
        return hmap
    }

    private fun getSomeVideo(videoId: String): Video {
        println("Downloading video")
        experienceNetWorkLatency()
        val video = Video(videoId, "Some video title")
        println("Done!" + "\n")
        return video
    }
}