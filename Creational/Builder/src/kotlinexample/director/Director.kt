package kotlinexample.director

import kotlinexample.builders.Builder
import kotlinexample.Car
import kotlinexample.Type
import kotlinexample.components.Engine
import kotlinexample.components.Transmission
import kotlinexample.components.TripComputer

internal class Director {
    fun createSportsCar(builder: Builder) {
        builder.defineType(Type.SPORTS_CAR)
        builder.defineSeats(2)
        builder.defineEngine(Engine(3.0, 0.0, false))
        builder.defineTransmission(Transmission.SEMI_AUTOMATIC)
//        builder.defineTripComputer(TripComputer())
    }
}