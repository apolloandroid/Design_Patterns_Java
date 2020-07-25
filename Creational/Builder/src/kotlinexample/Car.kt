package kotlinexample

import kotlinexample.components.Engine
import kotlinexample.components.GPSNavigator
import kotlinexample.components.Transmission
import kotlinexample.components.TripComputer

internal data class Car(
        val type: Type, val seats: Int, val engine: Engine,
        val transmission: Transmission, var tripComputer: TripComputer,
        val gpsNavigator: GPSNavigator, val fuel: Double) {
    init {
        tripComputer = TripComputer(this)
    }
}