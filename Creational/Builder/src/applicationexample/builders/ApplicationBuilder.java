package applicationexample.builders;

import applicationexample.applicationcomponents.DataBase;
import applicationexample.applicationcomponents.OperationSystem;
import applicationexample.applicationcomponents.Type;
import applicationexample.applications.Application;

public class ApplicationBuilder implements Builder {
    private double version;
    private String name;
    private int developersQuantity;
    private OperationSystem operationSystem;
    private String language;
    private boolean userInterface;
    private Type type;
    private DataBase dataBase;

    @Override
    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDevelopersQuantity(int developersQuantity) {
        this.developersQuantity = developersQuantity;
    }

    @Override
    public void setOperationSystem(OperationSystem operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void setUserInterface(boolean userInterface) {
        this.userInterface = userInterface;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Application getResult() {
        return new Application(version, name, developersQuantity, operationSystem, language, userInterface, type, dataBase);
    }
}
