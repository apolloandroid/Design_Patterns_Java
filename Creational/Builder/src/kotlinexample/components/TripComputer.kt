package kotlinexample.components

import kotlinexample.Car

internal class TripComputer(val car: Car) {
    fun showFuelLevel() {
        println("Fuel level: ${car.fuel}")
    }

    fun showStatus() = when (this.car.engine.isStarted) {
        true -> println("Car is started!")
        else -> println("Car is not started!")
    }
}