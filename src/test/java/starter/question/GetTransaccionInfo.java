package starter.question;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Browser;
import starter.ui.addtransation.AddTransactionPage;

public class GetTransaccionInfo {
    public static Question<String> getDescription() {
        return Question.about("get transaccion info").answeredBy(
                actor -> BrowseTheWeb.as(actor).textOf(AddTransactionPage.TRANSACION_TABLE_XPATH)
        );
    }
}
