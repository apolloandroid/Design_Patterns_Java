package carsexample.pickups;

public class FordPickup implements Pickup {
    @Override
    public void start() {
        System.out.println("Ford Pickup started!");
    }

    @Override
    public void stop() {
        System.out.println("Ford Pickup stopped!");
    }
}
