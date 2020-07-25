package abstractstructure.creators;

import abstractstructure.products.AbstractProduct;
import abstractstructure.products.ConcreteProductA;

public class ConcreteCreatorA extends AbstractCreator {
    @Override
    public AbstractProduct factoryMethod() {
        return new ConcreteProductA();
    }
}
