package starter.ui;

import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;

public class SummaryForm {
    public static Target VALIDATE_NAME_FIELD = Target.the("Validate name field")
            .locatedBy("//strong[contains(text(),'Nombre')]/parent::p");
    public static Target VALIDATE_LAST_NAME = Target.the("Validate last name")
            .locatedBy("//strong[contains(text(),'Apellido')]/parent::p");
    public static Target VALIDATE_AGE = Target.the("Validate name edad")
            .locatedBy("//strong[contains(text(),'Edad')]/parent::p");
    public static Target VALIDATE_PAIS = Target.the("Validate name pais")
            .locatedBy("//strong[contains(text(),'País')]/parent::p");
    public static Target VALIDATE_SEXO= Target.the("Validate name sexo")
            .locatedBy("//strong[contains(text(),'Sexo')]/parent::p");
    public static Target VALIDATE_CORREO = Target.the("Validate correo")
            .locatedBy("//strong[contains(text(),'Correo electrónico')]/parent::p");
    public static Target VALIDATE_DAY = Target.the("Validate day")
            .locatedBy("//strong[contains(text(),'Días en los que trabaja')]/parent::p");
    public static Target VALIDATE_PICTURE = Target.the("Validate picture")
            .locatedBy("//strong[contains(text(),'Foto de perfil')]/parent::p");

    public static Target REQUIRED_FIELD_ALERT = Target.the("required field alert")
            .locatedBy("//div[@role='alert']");

}
