package carsexample;

import carsexample.coupes.Coupe;
import carsexample.factories.CarFactory;
import carsexample.factories.FordFactory;
import carsexample.factories.NissanFactory;
import carsexample.pickups.Pickup;
import carsexample.sedans.Sedan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {
    private static Coupe coupe;
    private static Sedan sedan;
    private static Pickup pickup;

    public static void main(String[] args) throws IOException {
        String carFactoryName = getCarFactoryName();
        CarFactory carFactory = getCarFactory(carFactoryName);
        createCars(carFactory);
        startCars();
        stopCars();
    }

    private static String getCarFactoryName() throws IOException {
        String carFactoryName;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        carFactoryName = bufferedReader.readLine();
        return carFactoryName;
    }

    private static CarFactory getCarFactory(String carFactoryName) {
        CarFactory carFactory;
        switch (carFactoryName) {
            case "Ford":
                carFactory = new FordFactory();
                break;
            case "Nissan":
                carFactory = new NissanFactory();
                break;
            default:
                carFactory = null;
                break;
        }
        return carFactory;
    }

    private static void createCars(CarFactory carFactory) {
        coupe = carFactory.createCoupe();
        pickup = carFactory.createPickup();
        sedan = carFactory.createSedan();
    }

    private static void startCars() {
        coupe.start();
        sedan.start();
        pickup.start();
    }

    private static void stopCars() {
        coupe.stop();
        sedan.stop();
        pickup.stop();
    }
}
