package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;
import starter.ui.AmazonPage;

public class AmazonStepDefinition {

    @Given("{actor} ingresa a la plataforma amazon")
    public void que_el_usuario_ingresa_a_la_plataforma_amazon(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new AmazonPage()),
                Browser.deleteAllCookies(),
                Browser.maximize()

        );
    }
    @When("{actor} realiza busqueda de productos")
    public void usuario_realiza_busqueda_de_productos(Actor actor) {
        actor.attemptsTo(

        );
    }

}
