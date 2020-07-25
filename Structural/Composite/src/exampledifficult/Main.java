package exampledifficult;

import exampledifficult.editor.ImageEditor;
import exampledifficult.shapes.Circle;
import exampledifficult.shapes.CompoundShape;
import exampledifficult.shapes.Dot;
import exampledifficult.shapes.Rectangle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();
        editor.loadShapes(
                new Circle(10, 10, 10, Color.BLUE),
                new CompoundShape(
                        new Circle(110, 110, 5, Color.RED),
                        new Dot(160, 160, Color.RED)
                ),
                new CompoundShape(
                        new Rectangle(250, 250, Color.GREEN, 100, 100),
                        new Dot(240, 240, Color.GREEN),
                        new Dot(360, 360, Color.GREEN),
                        new Dot(240, 360, Color.GREEN),
                        new Dot(360, 240, Color.GREEN)
                )
        );
    }
}
