package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PrestamypeForm {
    public static Target Doc_FIELD = Target.the("dni field").locatedBy("//input[@id='document']");
    public static Target btn_register = Target.the("register button").locatedBy("//*[@id=\"nav-main\"]/div[1]/button");
    public static Target btn_continue = Target.the("continue button").locatedBy("//span[text()='Continuar']");
    public static Target phone_FIELD = Target.the("phone field").locatedBy("//input[@id='phone']");
    public static Target email_FIELD = Target.the("phone field").locatedBy("//input[@id='email']");
    public static Target accept = Target.the("ckech accept").locatedBy("//input[@id='aceptTerms']");
    public static Target btn_continuar = Target.the("continue").locatedBy("//span[text()='Continuar']");
    public static Target btn_son_correctos = Target.the("button correct").locatedBy("//button[normalize-space(text()='Si, son correctos')]");
    public static Target btn_ok = Target.the("button ok").locatedBy("//button[@type='button' and text()='OK']");
    public static Target bnt_register = Target.the("button register").locatedBy("//*[@id=\"nav-main\"]/div[1]/button");


}
