package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

public class inputRegister implements Task {
    String mail = "uno@yopmail.com";
    String password = "Cambio123*";
    String phone = "923456789";

    public inputRegister(){

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(phone).into(CSForm.INPUT_PHONE),
                Enter.theValue(mail).into(CSForm.INPUT_EMAIL_REGISTER),
                Enter.theValue(password).into(CSForm.INPUT_PASSWORD_REGISTER),
                WaitUntil.the(CSForm.SELECT_SOURCE, net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CSForm.SELECT_SOURCE),

                WaitUntil.the(CSForm.OPTION_SOURCE.of("Página web de Cuánto está el dólar"), net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CSForm.OPTION_SOURCE.of("Página web de Cuánto está el dólar")),
                Click.on(CSForm.CHECK),
                Click.on(CSForm.BUTTON_SUBMIT_REGISTER)
        );

    }
}
