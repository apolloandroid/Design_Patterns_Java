package kotlinexample.builders

import kotlinexample.Car
import kotlinexample.Type
import kotlinexample.components.Engine
import kotlinexample.components.GPSNavigator
import kotlinexample.components.Transmission
import kotlinexample.components.TripComputer

internal data class CarBuilder(
        var type: Type, var seats: Int, var engine: Engine,
        var transmission: Transmission, var tripComputer: TripComputer,
        var gpsNavigator: GPSNavigator, val fuel: Double) : Builder {
    override fun defineType(type: Type) {
        this.type = type
    }

    override fun defineSeats(seats: Int) {
        this.seats = seats
    }

    override fun defineEngine(engine: Engine) {
        this.engine = engine
    }

    override fun defineTransmission(transmission: Transmission) {
        this.transmission = transmission
    }

    override fun defineTripComputer(tripComputer: TripComputer?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun defineGPSNavigator(gpsNavigator: GPSNavigator) {
        this.gpsNavigator = gpsNavigator
    }

    var result: Car = TODO()
        get() = Car(type, seats, engine, transmission, tripComputer, gpsNavigator, fuel)
}