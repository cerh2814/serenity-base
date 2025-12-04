package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Message implements Task {

    public Message() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               WaitUntil.the(CSForm.Message_ERROR_REGISTER, isVisible()).forNoMoreThan(10).seconds(),
               Ensure.that(CSForm.Message_ERROR_REGISTER).text().contains("El usuario o contraseña son incorrectos")
       );
    }
}
