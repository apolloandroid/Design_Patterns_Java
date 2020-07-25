package examplekotlin.devices

abstract class Device {
    var channel = 1
    var enabled = false
    var volume = 30
        set(volume) {
            field = when {
                volume > 100 -> 100
                volume < 0 -> 0
                else -> volume
            }
        }

    fun printStatus() {
        println("------------------------------------")
        println("| I'm radio.")
        println("| I'm " + if (enabled) "enabled" else "disabled")
        println("| Current volume is $volume%")
        println("| Current channel is $channel")
        println("------------------------------------\n")
    }
}

class Tv() : Device()

class Radio() : Device()