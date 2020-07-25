package examplekotlin

import examplekotlin.devices.Device
import examplekotlin.devices.Radio
import examplekotlin.devices.Tv
import examplekotlin.remotes.AdvancedRemote
import examplekotlin.remotes.BasicRemote

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        testDevice(Radio())
        testDevice(Tv())
    }

    fun testDevice(device: Device) {
        println("Tests device with basic mode")
        val basicRemote = BasicRemote(device)
        basicRemote.power()
        device.printStatus()

        println()

        println("Tests device with advanced mode")
        val advancedRemote = AdvancedRemote(device)
        advancedRemote.power()
        advancedRemote.mute()
        device.printStatus()
    }
}