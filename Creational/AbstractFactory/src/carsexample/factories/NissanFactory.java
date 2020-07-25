package carsexample.factories;

import carsexample.coupes.Coupe;
import carsexample.coupes.NissanCoupe;
import carsexample.pickups.NissanPickup;
import carsexample.pickups.Pickup;
import carsexample.sedans.NissanSedan;
import carsexample.sedans.Sedan;

public class NissanFactory implements CarFactory {
    @Override
    public Sedan createSedan() {
        return new NissanSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new NissanCoupe();
    }

    @Override
    public Pickup createPickup() {
        return new NissanPickup();
    }
}
