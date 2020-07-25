package example.components

import example.cars.Car

class TripComputer {
    private var car: Car? = null
    fun setCar(car: Car?) {
        this.car = car
    }

//    fun showFuelLevel() {
//        println("Fuel level: " + car.getFuel())
//    }

//    fun showStatus() {
//        if (car.getEngine().isStarted) println("Car is started!") else println("Car is not started!")
//    }
}