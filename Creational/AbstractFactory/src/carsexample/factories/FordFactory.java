package carsexample.factories;

import carsexample.coupes.Coupe;
import carsexample.coupes.FordCoupe;
import carsexample.pickups.FordPickup;
import carsexample.pickups.Pickup;
import carsexample.sedans.FordSedan;
import carsexample.sedans.Sedan;

public class FordFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public Pickup createPickup() {
        return new FordPickup();
    }
}
