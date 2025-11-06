package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.LoginForm;

public class LoginUser implements Task {

    private final String username;
    private final String password;

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
               Enter.theValue(username).into(LoginForm.INPUT_USERNAME),
               Enter.theValue(password).into(LoginForm.INPUT_PASSWORD)
        );
    }


}

//  Enter.theValue("carmen").into(LoginForm.INPUT_USERNAME),
//                Enter.theValue("12345").into(LoginForm.INPUT_PASSWORD)
