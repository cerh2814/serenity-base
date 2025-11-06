package starter.Task.Register;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.RegisterForm;

public class RegisterUserIncompleto implements Task {
    private final String nameexpected;
    private final String lastNameexpected;

    public RegisterUserIncompleto(String nameexpected, String lastNameexpected) {
        this.nameexpected = nameexpected;
        this.lastNameexpected = lastNameexpected;
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(nameexpected).into(RegisterForm.NAME_FIELD),
                Enter.theValue(lastNameexpected).into(RegisterForm.LAST_NAME_FIELD));
    }
}
