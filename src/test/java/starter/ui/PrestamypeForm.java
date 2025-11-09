package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PrestamypeForm {
    public static Target Doc_FIELD = Target.the("dni field").locatedBy("//input[@id='document']");
    public static Target btn_register = Target.the("register button").locatedBy("//*[@id=\"nav-main\"]/div[1]/button");
    public static Target btn_continue = Target.the("continue button").locatedBy("//span[text()='Continuar']");
    public static Target phone_FIELD = Target.the("phone field").locatedBy("//input[@id='phone']");
    public static Target email_FIELD = Target.the("phone field").locatedBy("//input[@id='email']");
}
