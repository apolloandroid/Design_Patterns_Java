package examplesimple;

public class Main {
    public static void main(String[] args) {
        Component group = new GroupComponent();
        group.add(new Circle());

        Component group2 = new GroupComponent(new Circle(), new Circle(), new Circle());
        group.add(group2);
        group.draw();
    }
}
