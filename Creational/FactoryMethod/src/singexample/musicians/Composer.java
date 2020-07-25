package singexample.musicians;

import singexample.compositions.Composition;
import singexample.compositions.InstrumentalComposition;

public class Composer extends Musician {
    @Override
    public Composition createComposition() {
        return new InstrumentalComposition();
    }
}
