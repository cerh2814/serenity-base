package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.CSForm;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class BtnInicionSesion implements Task
{
    public static BtnInicionSesion btnInicionSesion()
    {
        return new BtnInicionSesion();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CSForm.BUTTON_INICIOSESION,isClickable()).forNoMoreThan(15).seconds(),
                Click.on(CSForm.BUTTON_INICIOSESION)
        );

    }
}
