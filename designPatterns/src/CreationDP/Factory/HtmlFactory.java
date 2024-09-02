package CreationDP.Factory;

public class HtmlFactory extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
