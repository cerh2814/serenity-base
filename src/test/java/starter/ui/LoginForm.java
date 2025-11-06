package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class LoginForm {

    public static Target INPUT_USERNAME = Target.the("username field").locatedBy("//input[@id='username']");
    public static Target INPUT_PASSWORD = Target.the("password field").locatedBy("//input[@id='password']");
    public static Target BUTTON_LOGIN = Target.the("login button").locatedBy("//button[text()='Iniciar sesión']");
    public static Target ALERT_MESSAGE = Target.the("alert message").locatedBy("//div[@role='alert']");
    public static Target BUTTON_ADD_TRANSACTION = Target.the("add transaction button").locatedBy("//button[text()='Añadir transacción']");
    public static Target BUTTON_DAY = Target.the("choice day").locatedBy("//input[@type='date']");
}


// Click.on("//div[@id='picker']")