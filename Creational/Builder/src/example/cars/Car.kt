package example.cars

import example.components.Engine
import example.components.GPSNavigator
import example.components.Transmission
import example.components.TripComputer

class Car(val type: Type?, val seats: Int, val engine: Engine?, val transmission: Transmission?,
          val tripComputer: TripComputer?, gpsNavigator: GPSNavigator?) {
    val gpsNavigator: GPSNavigator?
    var fuel = 0.0

    init {
        tripComputer!!.setCar(this)
        this.gpsNavigator = gpsNavigator
    }
}