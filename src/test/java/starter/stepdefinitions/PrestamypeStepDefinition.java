package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;

import net.serenitybdd.screenplay.targets.Target;
import starter.ui.PrestamypeForm;
import starter.ui.PrestamypePage;

import java.awt.*;

import static starter.ui.PrestamypeForm.btn_continue;
import static starter.ui.PrestamypeForm.btn_register;

public class PrestamypeStepDefinition {

    String  dni = "10321111";
    String correo = "uno@yopmail.com";
    String phone = "91111111";
    String password = "784522D";
    @Given("{actor} ingresar al navegador y abrir la pagina de prestamype")
    public void user_ingresar_al_navegador_y_abrir_la_pagina_de_prestamype(Actor actor) {
       actor.attemptsTo(
               // 1. Definir valores limite de dni
               //Open.url("https://public.test.prestamype.com/"),
               Open.browserOn(new PrestamypePage()),
               Browser.maximize(),
               Browser.deleteAllCookies(),
               Click.on(PrestamypeForm.btn_register),
               Enter.theValue("103").into("//input[@id='document']"),
               Click.on("//span[text()='Continuar']"),
               Ensure.that("//div[normalize-space(text())=' Igual a 8 dígitos']").containsIgnoringCase("Igual a 8 dígito")

       );
    }

    @When("{actor} ingresar valores maximo de input dni")
    public void ingresar_valores_maximo_de_input_dni(Actor actor) {
        actor.attemptsTo(
                Open.url("https://public.test.prestamype.com/"),
                Browser.maximize(),
                Browser.deleteAllCookies(),
                Click.on(PrestamypeForm.btn_register),
                Enter.theValue("10321111").into(PrestamypeForm.Doc_FIELD),
                Click.on(PrestamypeForm.btn_continue),
                Ensure.that("//div[normalize-space(text())=' Igual a 8 dígitos']").containsIgnoringCase("Igual a 8 dígito")


        );



    }

    @Given("{actor} ingresar valores minimos de input telefono")
    public void user_ingresar_valores_minimos_de_input_telefono(Actor actor) {
        actor.attemptsTo(
                Open.url("https://public.test.prestamype.com/"),
                Browser.maximize(),
                Browser.deleteAllCookies(),
                Click.on(PrestamypeForm.btn_register),
                Enter.theValue("10321111").into(PrestamypeForm.Doc_FIELD),
                Enter.theValue("911").into("//input[@id='phone']"),
                Click.on(PrestamypeForm.btn_continue),
                Ensure.that("//div[normalize-space(text())='Mínimo 7 caracteres']").containsIgnoringCase("Mínimo 7 caracteres")


        );


    }
    @Given("{actor} ingresar valores maximos de input telefono")
    public void user_ingresar_valores_maximos_de_input_telefono(Actor actor) {
        actor.attemptsTo(
                Open.url("https://public.test.prestamype.com/"),
                Browser.maximize(),
                Browser.deleteAllCookies(),
                Click.on(PrestamypeForm.btn_register),
                Enter.theValue("10321111").into(PrestamypeForm.Doc_FIELD),
                Enter.theValue("91111111").into(PrestamypeForm.phone_FIELD),
                Click.on(PrestamypeForm.btn_continue)

        );
    }

    @Given("{actor} ingresar error correo invalido")
    public void user_ingresar_error_correo_invalido(Actor actor) {
        actor.attemptsTo(
                Open.url("https://public.test.prestamype.com/"),
                Browser.maximize(),
                Browser.deleteAllCookies(),
                Click.on(PrestamypeForm.btn_register),
                Enter.theValue("10321111").into(PrestamypeForm.Doc_FIELD),
                Enter.theValue("91111111").into(PrestamypeForm.phone_FIELD),
                Enter.theValue("uno@").into(PrestamypeForm.email_FIELD),
                Click.on(PrestamypeForm.btn_continue),
                Ensure.that("//div[normalize-space(text())='El correo no es válido.']").containsIgnoringCase("El correo no es válido.")


        );
    }

    @Given("{actor} ingresar error correo valido")
    public void user_ingresar_error_correo_valido(Actor actor) {
        actor.attemptsTo(

                Open.url("https://public.test.prestamype.com/"),
                Browser.maximize(),
                Browser.deleteAllCookies(),
                Click.on(PrestamypeForm.btn_register),
                Enter.theValue(dni).into(PrestamypeForm.Doc_FIELD),
                Enter.theValue(phone).into(PrestamypeForm.phone_FIELD),
                Enter.theValue(correo).into(PrestamypeForm.email_FIELD),
                Enter.theValue(password).into("//input[@type='password']"),
                Enter.theValue(password).into("//input[@data-qa='repeatPassword']"),
                Click.on(PrestamypeForm.btn_continue),
                Click.on(PrestamypeForm.accept),
                Click.on(PrestamypeForm.btn_continuar),
                Switch.toWindowTitled("https://public.test.prestamype.com/registro"),
                Ensure.that(Target.the("dni field").locatedBy("//h5[1]")).text().containsIgnoringCase(dni),
                Ensure.that(Target.the("input email field").locatedBy("//h5[2]")).text().containsIgnoringCase(correo),
                Ensure.that(Target.the("input phone field").locatedBy("//h5[3]")).text().containsIgnoringCase(phone),
                Click.on(PrestamypeForm.btn_son_correctos),
                Ensure.that(Target.the("Ya existe una cuenta con email: " + correo).locatedBy("//div[@id='swal2-content']")).text().containsIgnoringCase("Ya existe una cuenta con email: " + correo),
                Click.on(PrestamypeForm.btn_ok)
        );
        int repeticiones = 3; // número de veces que quieres repetir la acción
        for (int i = 0; i < repeticiones; i++) {
            actor.attemptsTo(
                    Click.on(PrestamypeForm.btn_son_correctos)
            );
        }



    }

    @Given("{actor} ingresa al browser y abre la pagina de prestamype")
    public void user_ingresa_al_browser_y_abre_la_pagina_de_prestamype(Actor actor) {
      actor.attemptsTo(
              Open.url("https://public.test.prestamype.com/"),
              Browser.maximize(),
              Browser.deleteAllCookies()

      );
    }
    @When("{actor} da click en el boton registrar")
    public void user_da_click_en_el_boton_registrar(Actor actor) {
        actor.attemptsTo(
                Click.on(PrestamypeForm.btn_register)

        );
    }
    @When("{actor} ingresa datos validos en el formulario de registro")
    public void user_ingresa_datos_validos_en_el_formulario_de_registro(Actor actor) {
        actor.attemptsTo(
                Enter.theValue(dni).into(PrestamypeForm.Doc_FIELD),
                Enter.theValue(phone).into(PrestamypeForm.phone_FIELD),
                Enter.theValue(correo).into(PrestamypeForm.email_FIELD),
                Enter.theValue(password).into("//input[@type='password']"),
                Enter.theValue(password).into("//input[@data-qa='repeatPassword']"),
                Click.on(PrestamypeForm.btn_continue),
                Click.on(PrestamypeForm.accept),
                Click.on(PrestamypeForm.btn_continuar)

        );
    }
    @Then("{actor} input datos del formulario")
    public void user_input_datos_del_formulario(Actor actor) {
        actor.attemptsTo(
                Switch.toWindowTitled("https://public.test.prestamype.com/registro"),
                Ensure.that(Target.the("dni field").locatedBy("//h5[1]")).text().containsIgnoringCase(dni),
                Ensure.that(Target.the("input email field").locatedBy("//h5[2]")).text().containsIgnoringCase(correo),
                Ensure.that(Target.the("input phone field").locatedBy("//h5[3]")).text().containsIgnoringCase(phone),
                Click.on(PrestamypeForm.btn_son_correctos),
                Ensure.that(Target.the("Ya existe una cuenta con email: " + correo).locatedBy("//div[@id='swal2-content']")).text().containsIgnoringCase("Ya existe una cuenta con email: " + correo),
                Click.on(PrestamypeForm.btn_ok)

        );
    }

}

