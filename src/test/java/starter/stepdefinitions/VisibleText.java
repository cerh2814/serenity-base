package starter.stepdefinitions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v126.browser.Browser;

import java.util.List;
import java.util.stream.Collectors;

public class VisibleText implements Question<List<String>> {

    private final By locator;

    private VisibleText(By locator) {
        this.locator = locator;
    }

    public static VisibleText of(By locator) {
        return new VisibleText(locator);
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        List<WebElement> elements = driver.findElements(locator);
        return elements.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
    }

}
