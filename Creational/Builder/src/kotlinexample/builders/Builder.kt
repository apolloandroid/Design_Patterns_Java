package kotlinexample.builders

import kotlinexample.Car
import kotlinexample.Type
import kotlinexample.components.Engine
import kotlinexample.components.GPSNavigator
import kotlinexample.components.Transmission
import kotlinexample.components.TripComputer

internal interface Builder {
    fun defineType(type: Type)
    fun defineSeats(seats: Int)
    fun defineEngine(engine: Engine)
    fun defineTransmission(transmission: Transmission)
    fun defineTripComputer(tripComputer: TripComputer?)
    fun defineGPSNavigator(gpsNavigator: GPSNavigator)
}