package carsexample.sedans;

public class FordSedan implements Sedan {
    @Override
    public void start() {
        System.out.println("Ford Sedan started!");
    }

    @Override
    public void stop() {
        System.out.println("Ford Sedan stopped!");
    }
}
