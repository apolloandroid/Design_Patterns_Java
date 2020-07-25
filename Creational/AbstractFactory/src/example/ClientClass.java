package example;

import example.factories.GUIFactory;
import example.factories.MacOSFactory;
import example.factories.WindowsFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientClass {
    private static Application configureApplication() throws IOException {
        GUIFactory factory;
        Application application;

        String osName = getOSName();
        factory = getFactory(osName);
        application = new Application(factory);
        return application;
    }

    private static String getOSName() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String osName = bufferedReader.readLine();
        return osName;
    }

    private static GUIFactory getFactory(String osName) {
        GUIFactory factory;
        switch (osName) {
            case "MacOS":
                factory = new MacOSFactory();
                break;
            case "Windows":
                factory = new WindowsFactory();
                break;
            default:
                factory = null;
        }
        return factory;
    }

    public static void main(String[] args) throws IOException {
        Application application = configureApplication();
        application.paint();
    }
}
