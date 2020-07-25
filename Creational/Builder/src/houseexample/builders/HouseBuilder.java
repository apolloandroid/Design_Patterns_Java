package houseexample.builders;

import houseexample.housecomponents.*;
import houseexample.houses.House;

public class HouseBuilder implements Builder {
    private Material material;
    private Door door;
    private Garden garden;
    private Roof roof;
    private Wall wall;
    private int windows;

    @Override
    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    public House getResult() {
        return new House(material, door, garden, roof, wall, windows);
    }
}
