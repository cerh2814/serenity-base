package starter.ui.registration;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {
    public static Target INPUT_NAME = Target.the("input").locatedBy("//*[@id=\"name\"]");
    public static Target INPUT_LASTNAME = Target.the("last name").locatedBy("//*[@id=\"last-name\"]");
    public static Target INPUT_AGE = Target.the("age").locatedBy("//*[@id=\"age\"]");
    public static Target SELECT_COUNTRY = Target.the("select country").locatedBy("//select[@id='country']");
    public static Target INPUT_SEX = Target.the("select sex").locatedBy("//*[@id=\"sex-f\"]");
    public static Target INPUT_EMAIL = Target.the("email").locatedBy("//*[@id=\"email\"]");
    public static Target CHECKBOX_DAY = Target.the("checkbox day").locatedBy("//*[@id=\"monday\"]");
    public static Target INPUT_PICTURE = Target.the("picture").locatedBy("//*[@id=\"picture\"]");
    public static Target BUTTON_SAVE = Target.the("button save").locatedBy("//*[@id=\"save-btn\"]");
    public static Target ALERT_SUCCESS = Target.the("alert success").locatedBy("//div[@role='alert']");


}


