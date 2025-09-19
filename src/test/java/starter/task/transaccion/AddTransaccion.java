package starter.task.transaccion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.addtransation.AddTransactionPage;

public class AddTransaccion {
    public static Performable withInfo(String transaccionDate, String transaccionAmount, String transaccionDescription) {
        return Task.where("{0} adds a new transaction",
                Click.on(AddTransactionPage.BUTTON_ADD_TRANSACTION),
                Enter.theValue(transaccionDate).into(AddTransactionPage.INPUT_DATE),
                Enter.theValue(transaccionAmount).into(AddTransactionPage.INPUT_AMOUNT),
                Enter.theValue(transaccionDescription).into(AddTransactionPage.INPUT_DESCRIPTION),
                Click.on(AddTransactionPage.BUTTON_SAVE));
    }

}
