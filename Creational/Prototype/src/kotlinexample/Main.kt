package kotlinexample

import kotlinexample.cars.Car

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val car = Car("Toyota", "Sedan", 4, 4)
        car.printProperties()
        val copy = car.copy() as Car
        copy.printProperties()
        copy.apply {
            mark = "Nissan"
            carCase = "Coupe"
            seats = 2
            wheels = 6
            printProperties()
        }
    }
}