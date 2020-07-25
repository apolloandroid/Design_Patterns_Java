package example.factories;

import example.buttons.Button;
import example.buttons.MacOSButton;
import example.checkboxes.Checkbox;
import example.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
