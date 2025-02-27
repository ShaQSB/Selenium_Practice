import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRM_02_08_25 {

    public static void main(String[] args) throws InterruptedException{

        String un="Admin";
        String pwd="admin123";

        WebDriver driver=new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");




        WebElement naam=driver.findElement(By.name("username"));

        naam.sendKeys(un);

        Thread.sleep(3000);

      //  List<WebElement> elements=driver.findElements(By.className("oxd-input oxd-input--active"));

       // WebElement usn= elements.get(0);

       // usn.sendKeys(un);

       // WebElement passwd=elements.get(1);

       // passwd.sendKeys(pwd);

        WebElement lnktxt=driver.findElement(By.linkText("OrangeHRM, Inc"));

        lnktxt.click();




        WebDriver.Timeouts t=driver.manage().timeouts();

        WebDriver.Timeouts time=driver.manage().timeouts();

        time.implicitlyWait(Duration.ofSeconds(3));




    }
}