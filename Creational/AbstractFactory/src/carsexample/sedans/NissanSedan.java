package carsexample.sedans;

public class NissanSedan implements Sedan {
    @Override
    public void start() {
        System.out.println("Nissan Sedan started!");
    }

    @Override
    public void stop() {
        System.out.println("Nissan Sedan stopped!");
    }
}
