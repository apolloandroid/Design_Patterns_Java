package buildexample.builders;

import buildexample.buildings.Building;

public abstract class Builder {
    public abstract Building build();

    public void enterInTheExploit(Building building) {
        building.sayHello();
    }
}
