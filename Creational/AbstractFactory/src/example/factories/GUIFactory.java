package example.factories;

import example.buttons.Button;
import example.checkboxes.Checkbox;


public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
