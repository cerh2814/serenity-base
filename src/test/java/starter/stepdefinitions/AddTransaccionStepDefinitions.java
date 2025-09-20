package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import starter.models.LoginModels;
import starter.models.TransaccionModels;
import starter.task.login.Login;
import starter.task.navigation.NavigateTo;
import starter.task.transaccion.AddTransaccion;
import starter.task.transaccion.CheckTransaccion;
import starter.util.GetInfoFromTable;

import java.util.Formattable;
import java.util.List;


public class AddTransaccionStepDefinitions {

    @Given("{actor} se encuentra en la pagina de transacciones")
    public void SeEncuentraPaginaDeTransacciones(Actor actor, DataTable userLogin) {

        LoginModels loginModels = GetInfoFromTable.getLoginInfoCredentials(userLogin);

        actor.attemptsTo(
                NavigateTo.theLoginPage(),
                new Login(loginModels.getUsername(),loginModels.getPassword())
        );

    }
    @When("{actor} agrega una nueva transaccion")
    public void AgregaUnaNuevaTransaccion(Actor actor,DataTable transaccionData) {
        TransaccionModels transaccionModels = GetInfoFromTable.getTransaccionDataCredencials(transaccionData);

        actor.attemptsTo(
                AddTransaccion.withInfo(
                        transaccionModels.getTransaccionDate(),
                        transaccionModels.getTransaccionAmount(),
                        transaccionModels.getTransaccionDescription()
                )
        );


    }
    @Then("{actor} envia la informacion requerida")
    public void EnviaInformacionRequerida(Actor actor) {
        actor.attemptsTo(
                new CheckTransaccion()
        );

    }

}
