package starter.ui;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CSForm{

    public static Target BUTTON_INICIOSESION = Target.the("login button").locatedBy("//button[@id='btn-login']");
    public static final Target TAG_EMPRESARIO = Target.the("welcome message")
            .locatedBy("//div[@class='item-tab']");
    public static Target TAG_PERSONAL = Target.the("personal button").locatedBy("//div[@class='item-tab']");
    public static Target INPUT_EMAIL = Target.the("email input").locatedBy("//input[@label='Correo electrónico']");
    public static Target INPUT_PASSWORD = Target.the("password input").locatedBy("//input[@label='Contraseña']");
    public static Target BUTTON_SUBMIT = Target.the("submit button").locatedBy("//button[text()='Iniciar sesión']");
    public static Target BUTTON_REGISTER = Target.the("register button").locatedBy("//div[@id='btn-login-iniciar-sesion']");
    public static final Target SELECT_SOURCE = Target.the("select how did you hear").located(By.cssSelector("div.select__control"));
    public static final Target OPTION_SOURCE = Target.the("select option").locatedBy("//li[contains(@class,'select__option') and normalize-space(.)='{0}']");
    public static final Target INPUT_PHONE = Target.the("phone input").locatedBy("//input[@id='phone']");
    public static final Target INPUT_EMAIL_REGISTER = Target.the("email register input").locatedBy("//input[@id='email']");
    public static final Target INPUT_PASSWORD_REGISTER = Target.the("password register input").locatedBy("//input[@id='password']");
    public static final Target CHECK = Target.the("register submit button").locatedBy("//span[@role='checkbox']");
    public static final Target BUTTON_SUBMIT_REGISTER = Target.the("register submit button")
            .locatedBy("//button[@type='submit' and normalize-space(text()='Registrarme ')]");
    public static final Target Message_ERROR_REGISTER = Target.the("error message register")
            .locatedBy("//p[@class='txt-primary-red' and text()='El usuario o contraseña son incorrectos']");


}
