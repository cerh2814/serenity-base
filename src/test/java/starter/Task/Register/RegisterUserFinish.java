package starter.Task.Register;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

import java.net.URISyntaxException;

public class RegisterUserFinish {
    String nameexpected= "carla";
    String lastNameexpected= "Peele";
    String ageexpected= "25";
    String correo = "uno@yopmail.com";
    String countryexpected= "Colombia";
    String genero= "F";
    String day= "monday";

    @Given("{actor} realizar metodo de registro en localhost")
    public void user_realizar_metodo_de_registro_en_localhost(Actor actor) throws URISyntaxException {
        actor.attemptsTo(
                Open.url("http://127.0.0.1:5500/register.html"),
                Enter.theValue(nameexpected).into("//input[@id='name']"),
                Enter.theValue(lastNameexpected).into("//input[@id='last-name']"),
                Enter.theValue(ageexpected).into("//input[@id='age']"),
                SelectFromOptions.byVisibleText("" + countryexpected + "").from("//select[@id='country']" ),
                Click.on("//input[@class='form-check-input' and @value='"+genero+"']"),
                Enter.theValue(correo).into("//input[@id='email']"),
                Click.on(" //input[@class='form-check-input' and @id='"+day+"']"),
                Upload.theClasspathResource("picture/baby.png")
                        .to(Target.the("upload fields").locatedBy("//input[@id='picture']")),
                Click.on("//button[@id='save-btn']"),
                Switch.toWindowTitled("Summary"),
                Ensure.that(Target.the("name field").locatedBy("//strong[contains(text(),'Nombre')]/parent::p")).text().containsIgnoringCase(nameexpected),
                Ensure.that(Target.the("last name field").locatedBy("//strong[contains(text(),'Apellido')]/parent::p")).text().containsIgnoringCase(lastNameexpected),
                Ensure.that(Target.the("age field").locatedBy("//strong[contains(text(),'Edad')]/parent::p")).text().containsIgnoringCase(ageexpected),
                Ensure.that(Target.the("country field").locatedBy("//strong[contains(text(),'País')]/parent::p")).text().containsIgnoringCase(countryexpected)



        );
    }

}
