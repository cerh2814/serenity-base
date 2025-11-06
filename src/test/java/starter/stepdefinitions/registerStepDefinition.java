package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.Task.Register.RegisterUser;
import starter.Task.Register.RegisterUserIncompleto;
import starter.Task.Register.SummaryUser;
import starter.ui.RegisterPage;


import java.net.URISyntaxException;
import java.util.List;

public class registerStepDefinition {
    String nameexpected = "";
    String lastNameexpected = "";
    String ageexpected = "";
    String countryexpected = "";
    String generoexpected = "";
    String contraseaexpected = "";
    String dayexpected = "";



    @Given("{actor} quiere registrarse en localhost")
    public void user_quiere_registrarse_en_localhost(Actor actor) throws URISyntaxException {


        actor.attemptsTo(
                Open.browserOn(new RegisterPage())
        );


    }

    @When("{actor} ingresa sus datos validos datatable")
    public void user_ingresa_sus_datos_validos_datatable(Actor actor, DataTable userinfo) {
        List <List<String>> rows = userinfo.asLists(String.class);

        for (List <String> columns: rows) {
            nameexpected = columns.get(0);
            lastNameexpected = columns.get(1);
            ageexpected = columns.get(2);
            countryexpected = columns.get(3);
            generoexpected = columns.get(4);
            contraseaexpected = columns.get(5);
            dayexpected = columns.get(6);

        }

        actor.attemptsTo(
                new RegisterUser(nameexpected, lastNameexpected, ageexpected, countryexpected, generoexpected, contraseaexpected, dayexpected)
        );

    }


    @When("{actor} ingresa sus datos validos")
    public void user_ingresa_sus_datos_validos(Actor actor) {
        actor.attemptsTo(
              new RegisterUser(nameexpected, lastNameexpected, ageexpected, countryexpected, generoexpected, contraseaexpected, dayexpected)
        );


    }
    @Then("{actor} registro incompleto")
    public void registro_incompleto(Actor actor) {
        actor.attemptsTo(
                new RegisterUserIncompleto(nameexpected, lastNameexpected)
        );

//        String nameexpected = "Sandra";
//        String lastNameexpected = "Peres";
//        String ageexpected = "30";
//        String countryexpected = "Argentina";
//        String genero = "F";
//        String contraseaexpected = "uno@yopmail.com";
//        String day = "tuesday";
//        actor.attemptsTo(
//                Switch.toWindowTitled("Summary"),
//                Ensure.that(Target.the("name field").locatedBy("//strong[contains(text(),'Nombre')]/parent::p")).text().containsIgnoringCase(nameexpected)

        //);

    }

    @Then("{actor} valida los campos y realiza el registro exitoso")
    public void user_valida_los_campos_realiza_el_campo_exitoso(Actor actor) {
        actor.attemptsTo(
                new SummaryUser(nameexpected)
        );
    }


}

