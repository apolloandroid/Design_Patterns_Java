package buildexample;

import buildexample.builders.HouseBuilder;
import buildexample.builders.StadiumBuilder;

import buildexample.builders.Builder;
import buildexample.buildings.Building;

public class MainClass {
    public static void main(String[] args) {
        Builder[] builders = {new StadiumBuilder(), new HouseBuilder()};
        for (Builder builder : builders) {
            createBuilding(builder);
        }
    }

    private static void createBuilding(Builder builder) {
        Building building = builder.build();
        builder.enterInTheExploit(building);
    }
}
