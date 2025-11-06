package starter.Task.Login;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;


public class LoginUserFinish {


    @Given("{actor} ingresar las credenciales")
    public void user_ingresar_las_credenciales(Actor actor) {
        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/login.html"),
                Enter.theValue("carmen").into("//input[@id='username']"),
                Enter.theValue("12345").into("//input[@id='password']"),
                Click.on("//button[text()='Iniciar sesión']"),
                Ensure.that(Target.the("Mensaje de bienvenida").locatedBy("//div[@role='alert']")).text().containsIgnoringCase("Nombre de usuario o contraseña inválidos"),
                Click.on("//button[text()='Añadir transacción']"),
                Click.on("//div[@id='picker']")

        );

    }
}
