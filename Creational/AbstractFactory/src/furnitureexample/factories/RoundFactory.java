package furnitureexample.factories;

import furnitureexample.chairs.Chair;
import furnitureexample.chairs.RoundChair;
import furnitureexample.tables.RoundTable;
import furnitureexample.tables.Table;

public class RoundFactory implements Factory {
    @Override
    public Chair createChair() {
        return new RoundChair();
    }

    @Override
    public Table createTable() {
        return new RoundTable();
    }
}
