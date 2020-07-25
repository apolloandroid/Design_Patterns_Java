package abstractstructure;

import abstractstructure.creators.AbstractCreator;
import abstractstructure.creators.ConcreteCreatorA;
import abstractstructure.creators.ConcreteCreatorB;
import abstractstructure.products.AbstractProduct;

public class MainClass {
    public static void main(String[] args) {
        AbstractCreator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        for (AbstractCreator creator :
                creators) {
            AbstractProduct product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}
