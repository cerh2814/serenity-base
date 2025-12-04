package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;

public class LabroeStepDefinition {
    @Given("que el {actor} ingresa a la plataforma labroe")
    public void que_el_ingresa_a_la_plataforma_labroe(Actor actor) {

        actor.attemptsTo(
                Open.url("https://www.labroe.com"),
                Browser.deleteAllCookies(),
                Browser.maximize(),
                Click.on("//a[@href='/directorio/cotizar']")
                );
              //  List<String> nombredelista = actor.asksFor(VisibleText.of("//ul[contains(@class,'results')]//li"));
              // nombredelista.forEach(System.out::println);






    }
}
