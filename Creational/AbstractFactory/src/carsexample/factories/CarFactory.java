package carsexample.factories;

import carsexample.coupes.Coupe;
import carsexample.pickups.Pickup;
import carsexample.sedans.Sedan;

public interface CarFactory {
    Sedan createSedan();

    Coupe createCoupe();

    Pickup createPickup();
}
