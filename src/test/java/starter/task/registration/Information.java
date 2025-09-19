package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.registration.RegisterForm;

public class Information implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Ensure.that(RegisterForm.ALERT_SUCCESS).text()
                .contains("Por favor diligencie todos los campos");

    }
}
