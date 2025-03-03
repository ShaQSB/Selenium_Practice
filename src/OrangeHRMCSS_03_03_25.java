import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*login as user
Go to PIM section
Fill in the required details
click on search
Logout*/

public class OrangeHRMCSS_03_03_25 {

    public static void main(String[] args) throws InterruptedException {


        String user,pass,empname,id;


        user="Admin";

        pass="admin123";

        empname="joy smith";

        id="0364";

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement un=driver.findElement(By.cssSelector("input[placeholder='Username']"));

        un.sendKeys(user);

        WebElement pwd=driver.findElement(By.cssSelector("input[name*='password']"));

        pwd.sendKeys(pass);

        WebElement btn= driver.findElement(By.cssSelector("BUTTON[TYPE='SUBMIT']"));

        btn.click();

        WebElement pim=driver.findElement(By.cssSelector("a.oxd-main-menu-item[href='/web/index.php/pim/viewPimModule']"));

        pim.click();

        List<WebElement> einput=driver.findElements(By.cssSelector("input[placeholder^='Type for hints...']"));

        int empip= einput.size();

        System.out.println(empip);


        WebElement ename= einput.get(0);

        ename.sendKeys(empname);

        Thread.sleep(4000);

        List<WebElement> eid=driver.findElements(By.cssSelector("input[class='oxd-input oxd-input--active']"));

        WebElement empid=eid.get(1);

        empid.sendKeys(id);

        Thread.sleep(5000);

        WebElement estat=driver.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));

        estat.click();

        WebElement parttime= driver.findElement(By.xpath("//span[contains(text(),'Part-Time Contract')]"));

        parttime.click();

        //button.oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));

        submit.click();

        JavascriptExecutor je=(JavascriptExecutor) driver;

        je.executeScript("scroll(0,500)");

        Thread.sleep(5000);

        WebElement prof=driver.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']"));

        prof.click();

       WebElement logout=driver.findElement(By.cssSelector("a[role$='item'][href='/web/index.php/auth/logout']"));

        logout.click();



        driver.quit();











    }

}
