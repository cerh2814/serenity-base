package starter.ui;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CSForm{

    public static Target BUTTON_INICIOSESION = Target.the("login button").locatedBy("//button[@id='btn-login' and normalize-space(text()='Iniciar sesión')]");
    public static Target BUTTON_EMPRESARIAL = Target.the("empresarial button").locatedBy("//p[text()='Empresarial']");
    public static Target INPUT_EMAIL = Target.the("email input").locatedBy("//input[@label='Correo electrónico']");
    public static Target INPUT_PASSWORD = Target.the("password input").locatedBy("//input[@label='Contraseña']");
    public static Target BUTTON_SUBMIT = Target.the("submit button").locatedBy("//button[text()='Iniciar sesión']");
    public static Target MESSAGE_ERROR = Target.the("error message").locatedBy("//div[text()='El correo no está registrado']");
    public static Target BUTTON_REGISTER = Target.the("register button").locatedBy("//*[@id=\"__nuxt\"]/div/nav/div/div/div[1]/div/div[2]/div/div/div[4]/a");
    public static final Target SELECT_SOURCE = Target.the("select how did you hear").located(By.cssSelector("div.select__control"));
    public static final Target SELECT_DROPDOWN = Target.the("select dropdown").located(By.cssSelector("ul.select__dropdown"));
    public static final Target OPTION_SOURCE = Target.the("select option").locatedBy("//li[contains(@class,'select__option') and normalize-space(.)='{0}']");
    public static final Target INPUT_PHONE = Target.the("phone input").locatedBy("//input[@id='phone']");
    public static final Target INPUT_EMAIL_REGISTER = Target.the("email register input").locatedBy("//input[@id='email']");
    public static final Target INPUT_PASSWORD_REGISTER = Target.the("password register input").locatedBy("//input[@id='password']");
    public static final Target CHECK = Target.the("register submit button").locatedBy("//span[@role='checkbox']");
    public static final Target BUTTON_SUBMIT_REGISTER = Target.the("register submit button")
            .locatedBy("//button[@type='submit' and normalize-space(text()='Registrarme ')]");
    public static final Target LINK_EMPRESAS = Target.the("link empresas")
            .locatedBy("//a[@class='navbar__item nav-link align-self-sm-center hs-cta-trigger-button hs-cta-trigger-button-184757403047' and text()='Empresas']");


}
