package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.LoginForm;

public class mensajeUser implements Task {

    public mensajeUser() {
     }

     @Override
     public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ensure.that(LoginForm.ALERT_MESSAGE).text().containsIgnoringCase("nombre de usuario o contraseña inválidos")
        );

     }
 }


 // Ensure.that(Target.the("Mensaje de bienvenida").locatedBy("//div[@role='alert']")).text().containsIgnoringCase("Nombre de usuario o contraseña inválidos")