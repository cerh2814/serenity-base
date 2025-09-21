package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.registration.RegisterForm;

public class IncompleteAccount implements Task {
    private final String expectedname;
    private final String expectedlastName;
    private final String expectedAge;


    public IncompleteAccount(String expectedname, String expectedlastName, String expectedAge) {
        this.expectedname = expectedname;
        this.expectedlastName = expectedlastName;
        this.expectedAge = expectedAge;
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(expectedname).into(RegisterForm.INPUT_NAME),
                Enter.theValue(expectedlastName).into(RegisterForm.INPUT_LASTNAME),
                Enter.theValue(expectedAge).into(RegisterForm.INPUT_AGE),
                Click.on(RegisterForm.BUTTON_SAVE)
        );

    }
}
