package examplesimple;

public class Circle implements Component {

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException("Operstion is not supported");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("Operstion is not supported");
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }
}
