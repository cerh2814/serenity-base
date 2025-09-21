package starter.task.transaccion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.openqa.selenium.By;
import starter.question.GetTransaccionInfo;
import starter.ui.addtransation.AddTransactionPage;

public class CheckTransaccion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GetTransaccionInfo.getDescription()).contains("Compra de insumos"),
                Ensure.that(AddTransactionPage.TABLE_DATA).text().contains("500")
        );

    }
}
