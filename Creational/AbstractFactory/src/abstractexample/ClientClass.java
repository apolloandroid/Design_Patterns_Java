package abstractexample;

import abstractexample.factories.ConcreteFactoryOne;
import abstractexample.factories.ConcreteFactoryTwo;
import abstractexample.factories.FactoryInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientClass {
    private static FactoryInterface factory;

    private static String getFactoryName() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String factoryName = bufferedReader.readLine();
        bufferedReader.close();
        return factoryName;
    }

    private static void initializeFactory(String factoryName) {
        switch (factoryName) {
            case "One":
                factory = new ConcreteFactoryOne();
                break;
            case "Two":
                factory = new ConcreteFactoryTwo();
                break;
        }
    }

    private static void printProductsName(FactoryInterface factory) {
        factory.createProductA().printName();
        factory.createProductB().printName();
    }

    public static void main(String[] args) throws IOException {
        String factoryName = getFactoryName();
        initializeFactory(factoryName);
        printProductsName(factory);
    }
}
