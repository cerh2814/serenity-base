package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.ui.GoogleForm;
import starter.ui.GooglePage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoogleStepDefinition {
    @Given("que el {actor} ingresa a la plataforma google")
    public void que_el_ingresa_a_la_plataforma_google(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new GooglePage()),
                Browser.deleteAllCookies(),
                Browser.maximize(),
                WaitUntil.the(GoogleForm.BUTTON_CREATEACCOUNT, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.BUTTON_CREATEACCOUNT),
                WaitUntil.the(GoogleForm.SPAN_CREATEACCOUNT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.SPAN_CREATEACCOUNT),
                WaitUntil.the(GoogleForm.BTN_NEXT, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.BTN_NEXT),
                WaitUntil.the(GoogleForm.INPUT_FIRSTNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("test").into(GoogleForm.INPUT_FIRSTNAME),
                WaitUntil.the(GoogleForm.INPUT_LASTNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("helptest").into(GoogleForm.INPUT_LASTNAME),
                WaitUntil.the(GoogleForm.SIGUIENTE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.SIGUIENTE),
                WaitUntil.the(GoogleForm.DAY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("20").into(GoogleForm.DAY),
                WaitUntil.the(GoogleForm.YEAR, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue("1990").into(GoogleForm.YEAR),
                //mes
                WaitUntil.the(GoogleForm.MONTH, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.MONTH),
                WaitUntil.the(GoogleForm.SELECTMONTH, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.SELECTMONTH),
                WaitUntil.the(GoogleForm.GENERO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.GENERO),
                WaitUntil.the(GoogleForm.SELECTGENDER, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.SELECTGENDER),
                WaitUntil.the(GoogleForm.SIGUIENTE, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(GoogleForm.SIGUIENTE),
                Click.on("//span[@class='selectionc22")
               // Enter.theValue("awahelp").into("//input[@name='Username']")

                //Click.on("//*[@id=\"month\"]/div/div[2]/ul/li[4]")

        );

    }
    @When("{actor} realiza la creacion de correo electronico")
    public void realiza_la_creacion_de_correo_electronico(Actor actor) {

    }
    @Then("ingresar {actor} datos personales para la creacion de cuenta")
    public void ingresar_datos_personales_para_la_creacion_de_cuenta(Actor actor) {
    }

}
