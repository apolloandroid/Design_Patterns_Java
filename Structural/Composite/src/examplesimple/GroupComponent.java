package examplesimple;

import java.util.LinkedList;
import java.util.List;

public class GroupComponent implements Component {
    private List<Component> children;

    public GroupComponent(Component... components) {
        children = new LinkedList<>();
        for (Component component : components) {
            children.add(component);
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void draw() {
        for (Component component : children) {
            component.draw();
        }
    }
}
