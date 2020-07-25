package singexample.compositions;

public class Song implements Composition {
    @Override
    public void sound() {
        System.out.println("I am Song. I am sounding now!");
    }

    @Override
    public void pause() {
        System.out.println("I am Song. I am paused!");
    }
}
