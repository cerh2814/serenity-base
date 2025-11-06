package starter.Test;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.ui.Select;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String [] args) {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1:5500/register.html");
        driver.manage().window().maximize();
        System.out.println("El titulo es: " + driver.getTitle());
        Assert.assertEquals("Register", driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ana");
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Lopez");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("22");
        WebElement selectpais =  driver.findElement(By.xpath("//select[@id='country']"));
        selectpais.click();
        String pais = "Argentina";
        WebElement selectOption = driver.findElement(By.xpath("//option[@value='" + pais + "']"));
        selectOption.click();
        driver.findElement(By.xpath("//input[@type='radio' and @id='sex-f']")).click();
        driver.findElement(By.xpath("//input[@type='email' and @id='email']")).sendKeys("cerh@yopmail.com");
        //input[@type='checkbox' and @value='Lunes']
        String day = "Lunes";
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='"+day+"']")).click();
        String rutaArchivo = System.getProperty("user.dir") + "C:\\Users\\cerh2\\OneDrive\\Imágenes\\Capturas de pantalla\\1.png";
        WebElement inputFile = driver.findElement(By.xpath("//input[@type='button' and id='file-upload-button']"));
        // Si el input está oculto: ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", inputFile);
        inputFile.sendKeys(rutaArchivo);




    }
}
