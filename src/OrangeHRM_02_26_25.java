import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class OrangeHRM_02_26_25 {

    public static void main(String[] args) throws InterruptedException {

        String usn,pwd,pgtitle,fttitle;

                usn="Admin";
                pwd="admin123";



        WebDriver driver= new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().window().maximize();

        WebElement user= driver.findElement(By.xpath("//label[text()='Username']//following::input"));

        user.sendKeys(usn);

        WebElement pass= driver.findElement(By.xpath("//button[@type='submit']//preceding::input[@type='password']"));

        pass.sendKeys(pwd);

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

        login.click();

        Thread.sleep(2000);

        WebElement btn = driver.findElement(By.xpath("//button[@type='button' and @role='none']"));

        btn.click();

        Thread.sleep(4000);

        pgtitle=driver.getTitle();

        System.out.println(pgtitle);

        JavascriptExecutor je= (JavascriptExecutor) driver;

        /*je.executeScript("scroll(0,200)");

        Thread.sleep(4000);

        System.out.println("Scrolled 200 Px");*/

        WebElement oHM= driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.7']"));

        fttitle=oHM.getText();

        System.out.println(fttitle);

        je.executeScript("arguments[0].scrollIntoView(true)",oHM);

        Thread.sleep(4000);

        je.executeScript("scroll(0,0)");

        Thread.sleep(4000);

        WebElement dropdown=driver.findElement(By.xpath("//li[@class='--active oxd-userdropdown']"));

        dropdown.click();

        Thread.sleep(4000);

       /* String logout="Logout";

        List<WebElement> options= dropdown.findElements(By.tagName("li"));

        for (int i = 0; i < options.size() ; i++) {
            WebElement lists = options.get(i);
            System.out.println(lists.getText());
        }
        */

        driver.quit();










    }
}
