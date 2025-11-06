package starter.Task.Register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.SummaryForm;

public class SummaryUser implements Task {

    private final String nameexpected;



    public SummaryUser (String nameexpected){
      this.nameexpected = nameexpected;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toWindowTitled("Summary"),
                Ensure.that(SummaryForm.VALIDATE_NAME_FIELD).text().containsIgnoringCase(nameexpected),
                Ensure.that(SummaryForm.REQUIRED_FIELD_ALERT).text().contains("Por favor diligencie todos los campos")

//                Switch.toWindowTitled("Summary"),
//                Ensure.that(Target.the("name field").locatedBy("//strong[contains(text(),'Nombre')]/parent::p")).text().containsIgnoringCase(nameexpected),

        );

    }
}
