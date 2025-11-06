package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import starter.Task.Login.*;
import starter.ui.LoginPage;

public class LoginStepDefinition {

    String username = "user";
    String password = "pass";


    @Given("{actor} ingresar al navegador de registro")
    public void user_ingresar_al_navegador_de_registro(Actor actor) {
        actor.attemptsTo(
                Open.browserOn(new LoginPage())
        );

    }


    @When("{actor} input name and password")
    public void input_name_and_password(Actor actor) {
        actor.attemptsTo(
                new LoginUser(username, password)

        );

    }
    @Then("{actor} realizar click en el boton de registro")
    public void realizar_click_en_el_boton_de_registro(Actor actor) {
        actor.attemptsTo(
                new PressUser()


        );


    }
    @Then("{actor} verificar que el usuario se haya registrado exitosamente")
    public void verificar_que_el_usuario_se_haya_registrado_exitosamente(Actor actor) {
        actor.attemptsTo(


        );

    }

    @Then("{actor} show mensaje de unsuccessful registration")
    public void user_show_mensaje_de_unsuccessful_registration(Actor actor) {
        actor.attemptsTo(
                new mensajeUser()

        );

    }

    @Then("{actor} show mensaje de successful registration")
    public void user_show_mensaje_de_successful_registration(Actor actor) {
        actor.attemptsTo(
                new msjmessage()
        );
    }

    @Then("{actor} add new transaccion")
    public void add_new_transaccion(Actor actor) {
        actor.attemptsTo(
                new AddTransaccion()

        );

    }

    @Then("{actor} select fecha")
    public void user_select_fecha(Actor actor) {
        actor.attemptsTo(
             new SelectDay()
        );
    }

    @Then("user add mount")
    public void user_add_mount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user add description")
    public void user_add_description() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("click send transaccion")
    public void click_send_transaccion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user send transaccion")
    public void user_send_transaccion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
