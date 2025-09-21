package starter.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;
import starter.ui.login.LoginPage;

public class Login implements Task {

    private final String username;
    private final String password;


    public Login(String username, String password) {
        this.username = username;
        this.password = password;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
       // Open.url("http://127.0.0.1:5500/login.html"),
                Enter.theValue(this.username).into(LoginPage.INPUT_USER),
                Enter.theValue(this.password).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );

    }
}
