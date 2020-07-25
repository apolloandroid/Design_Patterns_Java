package singexample.musicians;

import singexample.compositions.Composition;
import singexample.compositions.Song;

public class Singer extends Musician {
    @Override
    public Composition createComposition() {
        return new Song();
    }
}
