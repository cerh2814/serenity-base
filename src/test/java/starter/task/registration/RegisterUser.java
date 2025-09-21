package starter.task.registration;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import starter.ui.registration.RegisterForm;

import java.net.URISyntaxException;

public class RegisterUser implements Task {
    private final String expectedname;
    private final String expectedlastName;
    private final String expectedAge;
    private final String expectedCountry;
    private final String expectedEmail;

    public RegisterUser(String expectedname, String expectedlastName, String expectedAge, String expectedCountry, String expectedEmail) {
        this.expectedname = expectedname;
        this.expectedlastName = expectedlastName;
        this.expectedAge = expectedAge;
        this.expectedCountry = expectedCountry;
        this.expectedEmail = expectedEmail;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Enter.theValue(expectedname).into(RegisterForm.INPUT_NAME),
                    Enter.theValue(expectedlastName).into(RegisterForm.INPUT_LASTNAME),
                    Enter.theValue(expectedAge).into(RegisterForm.INPUT_AGE),
                    SelectFromOptions.byVisibleText(expectedCountry).from(RegisterForm.SELECT_COUNTRY),
                    Click.on(RegisterForm.INPUT_SEX),
                    Enter.theValue(expectedEmail).into(RegisterForm.INPUT_EMAIL),
                    Click.on(RegisterForm.CHECKBOX_DAY),
                    Upload.theClasspathResource("picture/baby.png").
                            to(RegisterForm.INPUT_PICTURE),
                    Click.on(RegisterForm.BUTTON_SAVE));
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }
}
