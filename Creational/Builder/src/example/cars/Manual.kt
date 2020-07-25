package example.cars

//class Manual(private val type: Type?, private val seats: Int, private val engine: Engine?, private val transmission: Transmission?,
//             private val tripComputer: TripComputer?, private val gpsNavigator: GPSNavigator?) {
//    fun print(): String {
//        var info = ""
//        info += "Type of car: $type\n"
//        info += "Count of seats: $seats\n"
//        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n"
//        info += "Transmission: $transmission\n"
//        info += if (tripComputer != null) "Trip Computer: Functional" + "\n" else "Trip Computer: N/A" + "\n"
//        info += if (gpsNavigator != null) "GPS Navigator: Functional" + "\n" else "GPS Navigator: N/A" + "\n"
//        return info
//    }
//
//}