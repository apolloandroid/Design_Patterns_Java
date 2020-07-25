package abstractexample.factories;

import abstractexample.productsa.ConcreteProductATwo;
import abstractexample.productsa.ProductInterfaceA;
import abstractexample.productsb.ConcreteProductBTwo;
import abstractexample.productsb.ProductInterfaceB;

public class ConcreteFactoryTwo implements FactoryInterface {
    @Override
    public ProductInterfaceA createProductA() {
        return new ConcreteProductATwo();
    }

    @Override
    public ProductInterfaceB createProductB() {
        return new ConcreteProductBTwo();
    }
}
