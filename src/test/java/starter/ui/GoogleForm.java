package starter.ui;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleForm {

    public static Target BUTTON_CREATEACCOUNT = Target.the("create account button").locatedBy("//a[@class='gb_A']");
    public static Target SPAN_CREATEACCOUNT = Target.the("create account span").locatedBy("//span[@class='VfPpkd-vQzf8d' and text()='Crear cuenta']");
    public static Target BTN_NEXT = Target.the("next button").locatedBy("//span[@class='VfPpkd-StrnGf-rymPhb-b9t22c']");
    public static Target INPUT_FIRSTNAME = Target.the("first name input").locatedBy("//input[@id='firstName']");
    public static Target INPUT_LASTNAME = Target.the("last name input").locatedBy("//input[@id='lastName']");
    public static Target SIGUIENTE = Target.the("next").locatedBy("//span[@class='VfPpkd-vQzf8d' and text()='Siguiente']");
    public static Target DAY = Target.the("day input").locatedBy("//input[@name='day']");
    public static Target YEAR = Target.the("year input").locatedBy("//input[@id='year']");
    public static Target MONTH = Target.the("month dropdown").locatedBy("//div[@class='VfPpkd-aPP78e']");
    public static Target SELECTMONTH = Target.the("selecionar mes").locatedBy("//*[@id=\"month\"]/div/div[2]/ul/li[4]");
    public static Target GENERO = Target.the("select dropdown gender").locatedBy("//div[@class='Udn8cf aVfon']");
    public static Target SELECTGENDER = Target.the("selecionar genero").locatedBy("//*[@id=\"gender\"]/div/div[2]/ul/li[3]");

}
