package furnitureexample.factories;

import furnitureexample.chairs.Chair;
import furnitureexample.chairs.TriangularChair;
import furnitureexample.tables.Table;
import furnitureexample.tables.TriangularTable;

public class TriangularFactory implements Factory {
    @Override
    public Chair createChair() {
        return new TriangularChair();
    }

    @Override
    public Table createTable() {
        return new TriangularTable();
    }
}
