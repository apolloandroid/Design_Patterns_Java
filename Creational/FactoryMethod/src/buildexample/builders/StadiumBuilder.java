package buildexample.builders;

import buildexample.buildings.Building;
import buildexample.buildings.Stadium;

public class StadiumBuilder extends Builder {
    @Override
    public Building build() {
        return new Stadium();
    }
}
