import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHRMCSS_02_27_25 {


    public static void main(String[] args) throws  InterruptedException {

        String user,pwd;

        user="Admin";

        pwd="admin123";

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement usn= driver.findElement(By.cssSelector("input[name='username']"));

        usn.sendKeys(user);

        Thread.sleep(5000);

        WebElement pass=driver.findElement(By.cssSelector("input[type='password']"));

        pass.sendKeys(pwd);

        Thread.sleep(5000);

        WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));

        login.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
