package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioSesion implements Task {

    public InicioSesion() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        WaitUntil.the(CSForm.BUTTON_INICIOSESION ,isClickable()).forNoMoreThan(10).seconds(),
                Click.on(CSForm.BUTTON_INICIOSESION));
//                WaitUntil.the(CSForm.MESSAGE_ERROR, isVisible()).forNoMoreThan(10).seconds(),
//                Ensure.that(CSForm.MESSAGE_ERROR).text().containsIgnoringCase("El correo no está registrado"));
    }
}
