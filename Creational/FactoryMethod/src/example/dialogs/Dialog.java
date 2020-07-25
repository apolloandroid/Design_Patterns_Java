package example.dialogs;


import example.buttons.Button;

public abstract class Dialog {
    public final void render() {
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    public abstract Button createButton();
}

