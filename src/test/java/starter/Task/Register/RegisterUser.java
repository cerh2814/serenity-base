package starter.Task.Register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.targets.Target;
import starter.ui.RegisterForm;

public class RegisterUser implements Task {
    private final String nameexpected;
    private final String lastNameexpected;
    private final String ageexpected;
    private final String countryexpected;
    private final String generoexpected;
    private final String contraseaexpected;
    private final String dayexpected;


    public RegisterUser(String nameexpected, String lastNameexpected, String ageexpected, String countryexpected, String generoexpected, String contraseaexpected, String dayexpected) {
        this.nameexpected = nameexpected;
        this.lastNameexpected = lastNameexpected;
        this.ageexpected = ageexpected;
        this.countryexpected = countryexpected;
        this.generoexpected = generoexpected;
        this.contraseaexpected = contraseaexpected;
        this.dayexpected = dayexpected;


    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            actor.attemptsTo(
                    Enter.theValue(nameexpected).into(RegisterForm.NAME_FIELD),
                    Enter.theValue(lastNameexpected).into(RegisterForm.LAST_NAME_FIELD),
                    Enter.theValue(ageexpected).into(RegisterForm.AGE_FIELD),
                    SelectFromOptions.byVisibleText("" + countryexpected + "").from(RegisterForm.COUNTRY_DROPDOWN),
                    Click.on(RegisterForm.INPUT_SEX),
                    Enter.theValue(contraseaexpected).into(RegisterForm.INPUT_EMAIL),
                    Click.on(RegisterForm.INPUT_DAY),
                    Upload.theClasspathResource("picture/baby.png")
                            .to(Target.the("input picture").locatedBy(RegisterForm.INPUT_picture)),
                    Click.on(RegisterForm.BUTTON_SAVE)
                    //Click.on("//button[@id='save-btn']"),

            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
