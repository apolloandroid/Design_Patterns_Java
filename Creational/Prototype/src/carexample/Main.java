package carexample;

import carexample.cars.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.printProperties();
        Car copy = (Car) car.copy();
        copy.printProperties();
        car.setCarCase("Sedan");
        car.setMark("Toyota");
        car.setSeats(4);
        car.setWheels(4);
        car.printProperties();
        copy.printProperties();
    }
}
