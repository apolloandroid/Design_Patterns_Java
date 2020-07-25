package applicationexample.applications;

import applicationexample.applicationcomponents.DataBase;
import applicationexample.applicationcomponents.OperationSystem;
import applicationexample.applicationcomponents.Type;

public class Application {
    private double version;
    private String name;
    private int developersQuantity;
    private OperationSystem operationSystem;
    private String language;
    private boolean userInterface;
    private Type type;
    private DataBase dataBase;

    public Application(double version, String name, int developersQuantity, OperationSystem operationSystem,
                       String language, boolean userInterface, Type type, DataBase dataBase) {
        this.version = version;
        this.name = name;
        this.developersQuantity = developersQuantity;
        this.operationSystem = operationSystem;
        this.language = language;
        this.userInterface = userInterface;
        this.type = type;
        this.dataBase = dataBase;
    }

    public String getType() {
        return type.name();
    }
}
