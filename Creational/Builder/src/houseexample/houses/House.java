package houseexample.houses;

import houseexample.housecomponents.*;

public class House {
    private final Material material;
    private final Door door;
    private final Garden garden;
    private final Roof roof;
    private final Wall wall;
    private final int windows;

    public House(Material material, Door door, Garden garden, Roof roof, Wall wall, int windows) {
        this.material = material;
        this.door = door;
        this.garden = garden;
        this.roof = roof;
        this.wall = wall;
        this.windows = windows;
    }

    public void printType() {
        System.out.println(material.name());
    }

}
