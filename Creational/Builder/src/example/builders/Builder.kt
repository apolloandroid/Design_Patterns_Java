package example.builders

import example.cars.Type
import example.components.Engine
import example.components.GPSNavigator
import example.components.Transmission
import example.components.TripComputer

interface Builder {
    fun setType(type: Type?)
    fun setSeats(seats: Int)
    fun setEngine(engine: Engine?)
    fun setTransmission(transmission: Transmission?)
    fun setTripComputer(tripComputer: TripComputer?)
    fun setGPSNavigator(gpsNavigator: GPSNavigator?)
}