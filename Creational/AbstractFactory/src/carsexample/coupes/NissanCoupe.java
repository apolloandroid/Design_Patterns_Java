package carsexample.coupes;

public class NissanCoupe implements Coupe {
    @Override
    public void start() {
        System.out.println("Nissan Coupe started!");
    }

    @Override
    public void stop() {
        System.out.println("Nissan Coupe stopped!");
    }
}
