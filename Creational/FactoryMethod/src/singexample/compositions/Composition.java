package singexample.compositions;

public interface Composition {
    default void start() {
        this.sound();
    }

    void sound();

    default void stop() {
        this.pause();
    }

    void pause();
}
