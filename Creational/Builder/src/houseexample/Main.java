package houseexample;

import houseexample.builders.Builder;
import houseexample.builders.HouseBuilder;
import houseexample.housedirector.Director;
import houseexample.houses.House;

public class Main {
    public static void main(String[] args) {
        Builder builder = new HouseBuilder();
        Director director = new Director();
        director.buildWoodHouse(builder);
        House woodHouse = builder.getResult();
        director.buildBrickHouse(builder);
        House brickHouse = builder.getResult();

        woodHouse.printType();
        brickHouse.printType();
    }
}
