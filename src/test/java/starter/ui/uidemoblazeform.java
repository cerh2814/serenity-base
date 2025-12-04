package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class uidemoblazeform {
    public static Target Contact= Target.the("Validate name field")
            .locatedBy("//a[text()='Contact']");
    public static  Target modallabel= Target.the("modal label")
            .locatedBy("//h5[@id='exampleModalLabel']");
    public static Target email = Target.the("email field")
            .locatedBy("//input[@id='recipient-email']");
    public static Target name = Target.the("name field")
            .locatedBy("//input[@id='recipient-name']");
    public static Target message = Target.the("message field")
            .locatedBy("//textarea[@id='message-text']");

    public static Target sendmessagebutton = Target.the("send message button")
            .locatedBy("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
}
