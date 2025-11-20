package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CSCredenciales implements Task {

    private final String mail;
    private final String password;

    public CSCredenciales(String mail, String password) {
        this.mail = mail;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        WaitUntil.the(CSForm.BUTTON_INICIOSESION, isClickable()).forNoMoreThan(15).seconds(),
                Click.on(CSForm.BUTTON_INICIOSESION),
                WaitUntil.the(CSForm.BUTTON_EMPRESARIAL, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CSForm.BUTTON_EMPRESARIAL),
                WaitUntil.the(CSForm.INPUT_EMAIL, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(mail).into(CSForm.INPUT_EMAIL),
                WaitUntil.the(CSForm.INPUT_PASSWORD, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(password).into(CSForm.INPUT_PASSWORD));

    }
}
