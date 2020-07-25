package carsexample.pickups;

public class NissanPickup implements Pickup {
    @Override
    public void start() {
        System.out.println("Nissan Pickup started!");
    }

    @Override
    public void stop() {
        System.out.println("Nissan Pickup stopped!");
    }
}
