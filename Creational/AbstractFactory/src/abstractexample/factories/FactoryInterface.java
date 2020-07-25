package abstractexample.factories;

import abstractexample.productsa.ProductInterfaceA;
import abstractexample.productsb.ProductInterfaceB;

public interface FactoryInterface {
    ProductInterfaceA createProductA();

    ProductInterfaceB createProductB();
}
