package CreationDP.Factory;

public abstract class Dialog {

    public void renderButton() {
        Button button = createButton();
        button.render();
        button.onClick();
    }

    public abstract Button createButton();
}
