package abstractexample.factories;

import abstractexample.productsa.ConcreteProductAOne;
import abstractexample.productsa.ProductInterfaceA;
import abstractexample.productsb.ConcreteProductBOne;
import abstractexample.productsb.ProductInterfaceB;

public class ConcreteFactoryOne implements FactoryInterface {

    @Override
    public ProductInterfaceA createProductA() {
        return new ConcreteProductAOne();
    }

    @Override
    public ProductInterfaceB createProductB() {
        return new ConcreteProductBOne();
    }
}
