package starter.stepdefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.Task.CS.*;
import starter.ui.CSForm;
import starter.ui.CSPage;

import java.awt.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SCStepDefinition {
    String mail = "uno@yopma.com";
    String password = "Cambio123*";
    String phone = "123456789";

    @Given("que el {actor} está en la página de inicio de sesión de la plataforma CS")
    public void que_el_usuario_está_en_la_página_de_inicio_de_sesión_de_la_plataforma_cs(Actor actor) {
        actor.attemptsTo(
//                Open.url("https://public.test.cambioseguro.com/"),
                Open.browserOn(new CSPage()),
                Browser.maximize(),
                Browser.deleteAllCookies()

//                Click.on("//button[@id='btn-login' and normalize-space(text()=' Iniciar sesión ')]"),
//                Click.on("//p[text()='Empresarial']"),
//                Enter.theValue("uno@yopmail.com").into("//input[@label='Correo electrónico']"),
//                Enter.theValue("Cambio123*").into("//input[@label='Contraseña']"),
//                Click.on("//button[text()='Iniciar sesión']"),
//                Ensure.that("//div[text()='El correo no está registrado']").containsIgnoringCase("El correo no está registrado")

        );

    }

    @When("{actor} clic en el boton Iniciar sesion")
    public void usuario_clic_en_el_boton_Iniciar_sesion(Actor actor) {
        actor.attemptsTo(
                new InicioSesion()
        );

    }

    @When("{actor} ingresa sus credenciales invalidas")
    public void usuario_ingresa_sus_credenciales_invalidas(Actor actor) {
        actor.attemptsTo(
               new CSCredenciales(mail,password)
        );

    }

    @Then("{actor} recibe el mssje de error")
    public void usuario_recibe_el_mssje_de_error(Actor actor) {
        actor.attemptsTo(
               new Message()
        );
    }

    @Then("{actor} realiza click en el boton de iniciar sesion")
    public void usuario_realiza_click_en_el_boton_de_iniciar_sesion(Actor actor) {
       actor.attemptsTo(

       );
    }




    @When("{actor} clic en el boton de registro")
    public void usuario_clic_en_el_boton_de_registro(Actor actor) {
        actor.attemptsTo(
                Click.on(CSForm.BUTTON_REGISTER)
        );

    }

    @When("{actor} clic en el boton de inicio de session")
    public void usuario_clic_en_el_boton_de_inicio_de_session(Actor actor) {
        actor.attemptsTo(
                new BtnInicionSesion(),new btnregistrate()
        );

    }
    @When("{actor} clic en el boton de registrarse")
    public void usuario_clic_en_el_boton_de_registrarse(Actor actor) {
        actor.attemptsTo(
                 new inputRegister()
        );

    }
    @When("{actor} ingresa sus datos validos de registro")
    public void usuario_ingresa_sus_datos_validos_de_registro(Actor actor) {
       actor.attemptsTo(
       );
    }

    @When("{actor} cambiar dolares compra")
    public void user_cambiar_dolares_compra(Actor actor) {
        actor.attemptsTo(
            Click.on("//div[@class='rates-price active' and normalize_space='Dólar compra']")
        );

    }

    @When("{actor} ingresa el modulo empresa")
    public void user_ingresa_el_modulo_empresa(Actor actor) {
        actor.attemptsTo(

        );
    }




}
