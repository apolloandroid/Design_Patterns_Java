package buildexample.builders;

import buildexample.buildings.Building;
import buildexample.buildings.House;

public class HouseBuilder extends Builder {
    @Override
    public Building build() {
        return new House();
    }
}
