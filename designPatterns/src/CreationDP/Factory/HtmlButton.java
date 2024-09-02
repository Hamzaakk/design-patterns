package CreationDP.Factory;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<div> this an Html Button </div>");
    }

    @Override
    public void onClick() {
        System.out.println("the Button is clicked on the Html");
    }
}
