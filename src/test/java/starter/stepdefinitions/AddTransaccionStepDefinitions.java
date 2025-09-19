package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import starter.task.login.Login;
import starter.task.navigation.NavigateTo;
import starter.task.transaccion.AddTransaccion;
import starter.task.transaccion.CheckTransaccion;

import java.util.Formattable;
import java.util.List;


public class AddTransaccionStepDefinitions {

    @Given("{actor} se encuentra en la pagina de transacciones")
    public void SeEncuentraPaginaDeTransacciones(Actor actor, DataTable userLogin) {
        List<List<String>> rows = userLogin.asLists(String.class);
          String username="";
          String password="";

        for (List<String> columns : rows) {
            username = columns.get(0);
            password = columns.get(1);
        }

        actor.attemptsTo(
                NavigateTo.theLoginPage(),
                new Login(username,password)
        );

    }
    @When("{actor} agrega una nueva transaccion")
    public void AgregaUnaNuevaTransaccion(Actor actor,DataTable transaccionData) {
        List<List<String>> rows = transaccionData.asLists(String.class);
        String transaccionDate="";
        String transaccionAmount="";
        String transaccionDescription="";

        for (List<String> columns : rows) {
            transaccionDate = columns.get(0);
            transaccionAmount = columns.get(1);
            transaccionDescription= columns.get(2);
        }

        actor.attemptsTo(
                AddTransaccion.withInfo(transaccionDate,transaccionAmount,transaccionDescription)

        );
    }
    @Then("{actor} envia la informacion requerida")
    public void EnviaInformacionRequerida(Actor actor) {
        actor.attemptsTo(
                new CheckTransaccion()
        );

    }

}
