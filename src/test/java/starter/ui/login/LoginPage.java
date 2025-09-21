package starter.ui.login;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class LoginPage {
    public static final By INPUT_USER = By.xpath("//*[@id=\"username\"]");
    public static final By INPUT_PASSWORD = By.xpath("//*[@id=\"password\"]");
    public static final By BUTTON_LOGIN = By.xpath("//button[contains(.,'Iniciar sesión')]");
}

