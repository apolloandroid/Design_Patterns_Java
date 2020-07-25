package examplekotlin.remotes

import examplekotlin.devices.Device

open class BasicRemote(private val device: Device) : Remote {

    override fun power() {
        println("Remote: power toggle")
        when (device.enabled) {
            true -> device.enabled = false
            false -> device.enabled = true
        }
    }

    override fun volumeUp() {
        println("Remote: volume up")
        device.volume += 10
    }

    override fun volumeDown() {
        println("Remote: volume up")
        device.volume -= 10
    }

    override fun channelUp() {
        println("Remote: channel up")
        device.channel++
    }

    override fun channelDown() {
        device.channel--
    }
}

class AdvancedRemote(private val device: Device) : BasicRemote(device) {
    fun mute() {
        println("Remote: mute")
        device.volume = 0
    }
}