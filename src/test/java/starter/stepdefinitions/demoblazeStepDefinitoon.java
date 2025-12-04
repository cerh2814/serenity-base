package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Assert;
import starter.ui.uidemoblazeform;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class demoblazeStepDefinitoon {

    @Given("{actor} abre la página de Demoblaze")
    public void user_abre_la_página_de_demoblaze(Actor actor) {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/index.html"),
                Browser.deleteAllCookies(),
                Browser.maximize()
        );

    }
    @Given("{actor} ingresa el correo {string}, el name {string} y el mensaje {string}")
    public void user_ingresa_el_nombre_el_correo_y_el_mensaje( Actor actor,String correo, String name, String mensaje) {
        actor.attemptsTo(

                WaitUntil.the(uidemoblazeform.Contact, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(uidemoblazeform.Contact),
                WaitUntil.the(uidemoblazeform.modallabel, isVisible()).forNoMoreThan(10).seconds(),
                Ensure.that(uidemoblazeform.modallabel).text().contains("New message"),
    // Esperas para el input: visible y habilitado
                WaitUntil.the(uidemoblazeform.email, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(uidemoblazeform.email, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue(correo).into(uidemoblazeform.email),
                WaitUntil.the(uidemoblazeform.name, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(name).into(uidemoblazeform.name),
                WaitUntil.the(uidemoblazeform.message, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(mensaje).into(uidemoblazeform.message)
//                WaitUntil.the("id='recipient-name'", isEnabled()).forNoMoreThan(5).seconds(),
//                Enter.theValue("nombre").into("id='recipient-name'"),

//                WaitUntil.the("//button[text()='Send message']", isVisible()).forNoMoreThan(5).seconds(),
//                Click.on("//button[text()='Send message']")
        );


    }
    @When("{actor} da clic en el botón")
    public void user_da_clic_en_el_botón(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(uidemoblazeform.sendmessagebutton, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(uidemoblazeform.sendmessagebutton)
        );

    }

    @When("el {actor} cuenta la cantidad de productos disponibles {string}")
    public void el_usuario_cuenta_la_cantidad_de_productos_disponibles(Actor actor, String string) {
        actor.attemptsTo(
//                WaitUntil.the("//a[space.normalize(text()='Home ')]", isVisible()).forNoMoreThan(10).seconds(),
//                Click.on("//a[space.normalize(text()='Home ')]"),


        );
    }

    @When("el {actor} ingresa al modulo laptops")
    public void el_usuario_ingresa_al_modulo_laptops(Actor actor) {
       actor.attemptsTo(
               Switch.toFrame("//iframe"),
               WaitUntil.the("//a[normalize-space(text())='Laptops']", isVisible()).forNoMoreThan(10).seconds(),
               Click.on("//a[normalize-space(text())='Laptops']")

       );
    }
    @Then("el {actor} visualizarse la cantidad de productos")
    public void el_usuario_visualizarse_la_cantidad_de_productos(Actor actor) {
        actor.attemptsTo(

        );
    }


}
