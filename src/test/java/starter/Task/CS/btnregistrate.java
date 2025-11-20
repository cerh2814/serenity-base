package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

public class btnregistrate implements Task {



    public btnregistrate(){


    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CSForm.BUTTON_REGISTER)
                  //Ensure.that("//div[text()='El correo no está registrado']").containsIgnoringCase("El correo no está registrado")

        );

    }
}
