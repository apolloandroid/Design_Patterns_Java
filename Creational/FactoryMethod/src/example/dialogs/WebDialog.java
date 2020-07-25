package example.dialogs;

import example.buttons.Button;
import example.buttons.HTMLButton;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
