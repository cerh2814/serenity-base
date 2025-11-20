package starter.Task.CS;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SetImplicitWait {
    private final int seconds;

    private SetImplicitWait(int seconds) {
        this.seconds = seconds;
    }

    public static SetImplicitWait ofSeconds(int seconds) {
        return new SetImplicitWait(seconds);
    }


    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
