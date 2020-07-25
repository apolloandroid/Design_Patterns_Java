package examplemusicstandards

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val musicalPlayer = MusicalPlayer()
        musicalPlayer.playMusic(Mp3Standard())
        println()
        musicalPlayer.playMusic(Adapter(WavStandard()))
    }

    class MusicalPlayer {
        fun playMusic(audioStandard: Mp3Standard) {
            println("Loading!")
            audioStandard.go()
            println("Track is finished!")
        }
    }

    open class Mp3Standard {
        open fun go() {
            println("MP3 standard is playing!")
        }
    }

    class WavStandard {
        fun go() {
            println("WAV standard is playing!")
        }
    }

    class Adapter(private val wavStandard: WavStandard) : Mp3Standard() {
        override fun go() {
            wavStandard.go()
        }
    }
}


