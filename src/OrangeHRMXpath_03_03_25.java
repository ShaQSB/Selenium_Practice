import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

/*login as user
Go to PIM section
Fill in the required details
click on search
Logout*/




public class OrangeHRMXpath_03_03_25 {

    public static void main(String[] args) throws InterruptedException {

        String user="Admin";

        String pass="admin123";

        String name,employeeID;

        name="joy smith";

        employeeID="0364";

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement un=driver.findElement(By.xpath("//input[@name='username']"));

        un.sendKeys(user);

        WebElement pwd=driver.findElement(By.xpath("//label[text()='Password']//following::input[1]"));

        pwd.sendKeys(pass);


        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));////button[text()='login']

        login.click();

        WebElement pim=driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));

        pim.click();

        WebElement empname=driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));

        empname.sendKeys(name);

        List<WebElement> eid=driver.findElements(By.xpath("//input[contains(@class,'oxd-input oxd-input--active')]"));

        WebElement empid=eid.get(1);

        empid.sendKeys(employeeID);

        WebElement empstat= driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]"));

        empstat.click();

        WebElement freelance=driver.findElement(By.xpath("//span[text()='Freelance']"));

        freelance.click();

        Thread.sleep(4000);

        JavascriptExecutor je=(JavascriptExecutor) driver;

        je.executeScript("scroll(0,900)");

        /*


        Exception in thread "main" org.openqa.selenium.ElementClickInterceptedException:
        element click intercepted:
        Element <button data-v-10d463b7=""
        data-v-7044e35a="" type="submit"
        class="oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space">...</button> is not clickable at point (1398, 16). Other element would receive the click: <span data-v-bdd6d943="" class="oxd-userdropdown-tab">...</span>

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));

        submit.click();*/

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));

        submit.click();

        Thread.sleep(5000);

        WebElement icon=driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));

        icon.click();

        WebElement logout= driver.findElement(By.xpath("//a[text()='Logout']"));

        logout.click();


        driver.quit();








    }
}
