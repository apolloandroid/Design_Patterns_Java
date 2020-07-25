package abstractstructure.creators;

import abstractstructure.products.AbstractProduct;
import abstractstructure.products.ConcreteProductB;

public class ConcreteCreatorB extends AbstractCreator {
    @Override
    public AbstractProduct factoryMethod() {
        return new ConcreteProductB();
    }
}
