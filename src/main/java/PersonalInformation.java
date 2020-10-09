import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverSupliter;

public class PersonalInformation {
    private static WebDriver Driver;

    public static void information (String firstname, String lastname,String email) {
        Driver = WebDriverSupliter.getChromeDriver();

        Driver.findElement(By.id("firstname")).clear();
        Driver.findElement(By.id("firstname")).sendKeys(firstname);
        Driver.findElement(By.id("lastname")).clear();
        Driver.findElement(By.id("lastname")).sendKeys(lastname);
        Driver.findElement(By.id("email")).clear();
        Driver.findElement(By.id("email")).sendKeys(email);
        Driver.findElement(By.cssSelector(".form-group:nth-child(3)")).click();
        Driver.findElement(By.id("days")).click();
        {
            WebElement dropdown = Driver.findElement(By.id("days"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:5\\s+']")).click();
        }
        Driver.findElement(By.id("months")).click();
        {
            WebElement dropdown = Driver.findElement(By.id("months"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:August\\s']")).click();
        }
        Driver.findElement(By.id("years")).click();
        {
            WebElement dropdown = Driver.findElement(By.id("years"));
            dropdown.findElement(By.xpath("//option[. = 'regexp:2001\\s+']")).click();
        }


    }
}
