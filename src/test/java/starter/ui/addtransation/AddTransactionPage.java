package starter.ui.addtransation;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddTransactionPage {
    public static Target BUTTON_ADD_TRANSACTION = Target.the("Add transaccion").locatedBy("//button[contains(.,'Añadir transacción')]");
    public static Target INPUT_DATE = Target.the("Input date").locatedBy("//*[@id=\"date\"]");
    public static Target INPUT_AMOUNT = Target.the("Input amount").locatedBy("//*[@id=\"amount\"]");
    public static Target INPUT_DESCRIPTION = Target.the("Input description").locatedBy("//*[@id=\"description\"]");
    public static Target BUTTON_SAVE = Target.the("Button save").locatedBy("//button[contains(.,'Guardar')]");
    public static Target TABLE_DATA = Target.the("Table description").located(By.xpath("//*[@id=\"transactions-list\"]"));
    public static String TRANSACION_TABLE_XPATH = "xpath: //table/tbody/tr[1]/td[2]";


}
