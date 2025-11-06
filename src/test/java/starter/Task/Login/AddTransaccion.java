package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.ui.LoginForm;

public class AddTransaccion implements Task {

    public AddTransaccion() {

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginForm.BUTTON_ADD_TRANSACTION)

        );


    }
}
//Click.on("//button[text()='Añadir transacción']")