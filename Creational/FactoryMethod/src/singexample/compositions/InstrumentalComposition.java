package singexample.compositions;

public class InstrumentalComposition implements Composition {
    @Override
    public void sound() {
        System.out.println("I am InstrumentalComposition. I am sounding now!");
    }

    @Override
    public void pause() {
        System.out.println("I am InstrumentalComposition. I am paused!");
    }
}
