package houseexample.builders;

import houseexample.housecomponents.*;
import houseexample.houses.House;

public interface Builder {
    void setMaterial(Material material);

    void setDoor(Door door);

    void setGarden(Garden garden);

    void setRoof(Roof roof);

    void setWall(Wall wall);

    void setWindows(int windows);
    House getResult();
}
