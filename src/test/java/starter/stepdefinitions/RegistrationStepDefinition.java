package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.*;
import starter.task.registration.CheckNewAccount;
import starter.task.registration.IncompleteAccount;
import starter.task.registration.Information;
import starter.task.registration.RegisterUser;
import starter.ui.registration.RegisterPage;

import java.net.URISyntaxException;
import java.util.List;

public class RegistrationStepDefinition {
    String expectedname = "";
    String expectedlastName = "";
    String expectedAge = "";
    String expectedEmail = "";
    String expectedCountry = "";




    @Given("{actor} se registra en la pagina de registro")
    public void seRegistraEnLaPaginaDeRegistro(Actor actor) {

        actor.attemptsTo(
                Open.browserOn(new RegisterPage())
        );

    }

    @When("{actor} envia informacion requerida")
    public void EnviaInformacionRequerida(Actor actor, DataTable UserInfo) throws URISyntaxException {

        List<List<String>> rows = UserInfo.asLists(String.class);
        for (List<String> columns : rows) {
            expectedname = columns.get(0);
            expectedlastName = columns.get(1);
            expectedAge = columns.get(2);
            expectedEmail = columns.get(3);
            expectedCountry = columns.get(4);


        }

        actor.attemptsTo(
                new RegisterUser(expectedname, expectedlastName, expectedAge, expectedCountry, expectedEmail)
        );

    }
    @And("{actor} submit the registration form")
    public void SubmitTheRegistration(Actor actor) {
        actor.attemptsTo(
                new CheckNewAccount(expectedname, expectedlastName)
        );




    }
    @When("{actor} deja campos requeridos vacios")
    public void DejaCamposRequeridosVacios(Actor actor) {
        actor.attemptsTo(
                new IncompleteAccount(expectedname, expectedlastName, expectedAge));

    }
    @Then("{actor} no envia la informacion requerida")
    public void NoEnviaLaInformacionRequerida(Actor actor) {
        actor.attemptsTo(
                new Information());

    }



}

