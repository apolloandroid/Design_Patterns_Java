package furnitureexample.factories;

import furnitureexample.chairs.Chair;
import furnitureexample.tables.Table;

public interface Factory {
    Chair createChair();

    Table createTable();
}
