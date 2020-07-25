package applicationexample.builders;

import applicationexample.applicationcomponents.DataBase;
import applicationexample.applicationcomponents.OperationSystem;
import applicationexample.applicationcomponents.Type;
import applicationexample.applications.Application;

public interface Builder {

    void setVersion(double version);

    void setName(String name);

    void setDevelopersQuantity(int developersQuantity);

    void setOperationSystem(OperationSystem operationSystem);

    void setLanguage(String language);

    void setUserInterface(boolean userInterface);

    void setType(Type type);

    void setDataBase(DataBase dataBase);

    Application getResult();
}
