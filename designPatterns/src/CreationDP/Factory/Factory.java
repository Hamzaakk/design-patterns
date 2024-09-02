package CreationDP.Factory;

public class Factory {

    public static Button getButton(String label) {

        if(label.equals("html")) {
            return new HtmlFactory().createButton();
        }
        else if(label.equals("widows")) {
            return new WindowsFactory().createButton();
        }
        else {
            return null;
        }
    }
}
