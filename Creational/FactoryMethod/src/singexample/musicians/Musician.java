package singexample.musicians;

import singexample.compositions.Composition;

public abstract class Musician {
    public abstract Composition createComposition();

    public final void performComposition() {
        Composition composition = createComposition();
        composition.start();
        composition.stop();
    }
}
