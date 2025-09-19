package starter.ui.registration;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static Target LABEL_NAME = Target.the("Label Name").locatedBy("//strong[contains(text(), 'Nombre')]/parent::p");
    public static Target LABEL_LASTNAME = Target.the("Label Last Name").locatedBy("//strong[contains(text(), 'Apellido')]/parent::p");
    //public static Target LABEL_AGE = Target.the("Label Age").locatedBy("//strong[contains(text(), 'Edad')]/parent::p");
    //public static Target LABEL_COUNTRY = Target.the("Label Country").locatedBy("//strong[contains(text(), 'País')]/parent::p");
    //public static Target LABEL_EMAIL = Target.the("Label Email").locatedBy("//strong[contains(text(), 'Email')]/parent::p");
}
