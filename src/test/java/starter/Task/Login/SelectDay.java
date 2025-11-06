package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.LoginForm;

public class SelectDay implements Task {

    public SelectDay(){

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(LoginForm.BUTTON_DAY)
                Enter.theValue("15-15-2025").into(LoginForm.BUTTON_DAY)
                //Enter.theValue(username).into(LoginForm.INPUT_USERNAME),
        );
    }
}
