package example

import example.builders.CarBuilder
import example.cars.Type
import example.director.Director

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val director = Director()
        val carBuilder = CarBuilder()
        director.constructSportsCar(carBuilder)
        val car = carBuilder.result
        println("Car built:\n" + car.type)
        carBuilder.setType(Type.CITY_CAR)
        println("Car built:\n" + car.type)
    }
}