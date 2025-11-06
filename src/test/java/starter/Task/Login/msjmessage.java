package starter.Task.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Switch;

public class msjmessage implements Task {

    public msjmessage(){

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toWindowTitled("transactions")



        );

    }
}


