package carsexample.coupes;

public class FordCoupe implements Coupe {

    @Override
    public void start() {
        System.out.println("Ford Coupe started!");
    }

    @Override
    public void stop() {
        System.out.println("Ford Coupe stopped!");
    }
}
