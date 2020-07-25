package applicationexample.director;

import applicationexample.applicationcomponents.DataBase;
import applicationexample.applicationcomponents.OperationSystem;
import applicationexample.applicationcomponents.Type;
import applicationexample.builders.Builder;

public class Director {

    public void createAndroidApplication(Builder builder) {
        builder.setVersion(0);
        builder.setName("Android application");
        builder.setDevelopersQuantity(2);
        builder.setOperationSystem(OperationSystem.ANDROID);
        builder.setLanguage("Kotlin");
        builder.setUserInterface(true);
        builder.setType(Type.MOBILE);
        builder.setDataBase(DataBase.SQLITE);
    }

    public void createIosApplication(Builder builder) {
        builder.setVersion(0);
        builder.setName("iOS application");
        builder.setDevelopersQuantity(2);
        builder.setOperationSystem(OperationSystem.IOS);
        builder.setLanguage("Swift");
        builder.setUserInterface(true);
        builder.setType(Type.MOBILE);
        builder.setDataBase(DataBase.MYSQL);
    }

    public void createDesktopApplication(Builder builder) {
        builder.setVersion(0);
        builder.setName("Desktop application");
        builder.setDevelopersQuantity(4);
        builder.setOperationSystem(OperationSystem.WINDOWS);
        builder.setLanguage("C#");
        builder.setUserInterface(true);
        builder.setType(Type.DESKTOP);
        builder.setDataBase(DataBase.ORACLE);
    }

    public void createEmbeddedApplication(Builder builder) {
        builder.setVersion(0);
        builder.setName("Embedded application");
        builder.setDevelopersQuantity(4);
        builder.setOperationSystem(OperationSystem.LINUX);
        builder.setLanguage("C++");
        builder.setUserInterface(true);
        builder.setType(Type.EMBEDDED);
        builder.setDataBase(DataBase.ORACLE);
    }

    public void createWebApplication(Builder builder) {
        builder.setVersion(0);
        builder.setName("Web application");
        builder.setDevelopersQuantity(4);
        builder.setOperationSystem(OperationSystem.LINUX);
        builder.setLanguage("PHP");
        builder.setUserInterface(true);
        builder.setType(Type.WEB);
        builder.setDataBase(DataBase.MONGODB);
    }


}
