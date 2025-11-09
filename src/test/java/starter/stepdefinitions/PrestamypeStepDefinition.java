package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import starter.ui.PrestamypeForm;

import static starter.ui.PrestamypeForm.btn_continue;
import static starter.ui.PrestamypeForm.btn_register;

public class PrestamypeStepDefinition {
    @Given("{actor} ingresar al navegador y abrir la pagina de prestamype")
    public void user_ingresar_al_navegador_y_abrir_la_pagina_de_prestamype(Actor actor) {
       actor.attemptsTo(
               // 1. Definir valores limite de dni
               Open.url("https://public.test.prestamype.com/"),
               Browser.maximize(),
               Browser.deleteAllCookies(),
               Click.on("//*[@id=\"nav-main\"]/div[1]/button"),
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

    @Given("{actor} ingresar error correo inalido")
    public void user_ingresar_error_correo_inalido(Actor actor) {
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
}
