package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.ui.registration.SummaryPage;

public class CheckNewAccount implements Task {

    private final String expectedname;
    private final String expectedlastName;

    public CheckNewAccount(String expectedname, String expectedlastName) {
        this.expectedname = expectedname;
        this.expectedlastName = expectedlastName;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toWindowTitled("Summary"),
                Ensure.that(SummaryPage.LABEL_NAME).text()
                                .containsIgnoringCase(expectedname),
                Ensure.that(SummaryPage.LABEL_LASTNAME).text()
                                .containsIgnoringCase(expectedlastName)


                );

    }
}
