package houseexample.housedirector;

import houseexample.builders.Builder;
import houseexample.housecomponents.*;

public class Director {
    public void buildWoodHouse(Builder builder) {
        builder.setMaterial(Material.WOOD);
        builder.setDoor(Door.WOOD);
        builder.setGarden(new Garden(10.0, 10.0));
        builder.setRoof(Roof.WOODEN);
        builder.setWall(new Wall(Material.WOOD));
        builder.setWindows(6);
    }

    public void buildBrickHouse(Builder builder) {
        builder.setMaterial(Material.BRICK);
        builder.setDoor(Door.METALLIC);
        builder.setGarden(new Garden(10.0, 10.0));
        builder.setRoof(Roof.METALLIC);
        builder.setWall(new Wall(Material.BRICK));
        builder.setWindows(6);
    }
}
