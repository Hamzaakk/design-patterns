package CreationDP.Factory;

public class WindowsFactory extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
