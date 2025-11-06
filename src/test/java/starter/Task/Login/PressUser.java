package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginForm;

public class PressUser implements Task {

    public PressUser() {

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginForm.BUTTON_LOGIN)
        );

    }
}
