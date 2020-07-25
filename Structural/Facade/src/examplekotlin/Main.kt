package examplekotlin

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val mp4video = VideoConversionFacade.convertVideo("youtubevideo.ogg", "mp4")
    }
}