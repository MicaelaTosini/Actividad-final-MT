import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class Password {
    private static WebDriver Driver;

    public static void contraseña (String oldpassword, String passwd, String confirmation) {
        Driver = WebDriverSupliter.getChromeDriver();

        Driver.findElement(By.id("oldpassword")).clear();
        Driver.findElement(By.id("oldpassword")).sendKeys(oldpassword);
        Driver.findElement(By.id("passwd")).clear();
        Driver.findElement(By.id("passwd")).sendKeys(passwd);
        Driver.findElement(By.id("confirmation")).clear();
        Driver.findElement(By.id("confirmation")).sendKeys(confirmation);
        Driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}
