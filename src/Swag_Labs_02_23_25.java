import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swag_Labs_02_23_25 {
   /* Login
    Click On the about section
    Scroll down to the bottom of the page
    Get the secret sauce lab text
    Scroll back up the page
    Go back to the test page
    Use the drop down to sort the page According to the price
    Logout


*/


    public static void main(String[] args) throws InterruptedException{

        String website = "https://www.saucedemo.com/";

        String user,passwd;


        user = "standard_user";
        passwd="secret_sauce";



        WebDriver driver = new ChromeDriver();

        driver.get(website);

        driver.manage().window().maximize();

        WebElement un =driver.findElement(By.xpath("//input[@class='input_error form_input'][@id='user-name']"));

        un.sendKeys(user);

        WebElement pwd= driver.findElement(By.xpath("//input[@class='input_error form_input' and @id='password']"));

        pwd.sendKeys(passwd);

        WebElement login= driver.findElement(By.xpath("//input[contains(@type,'submit')]"));

        login.click();

        Thread.sleep(2000);

        WebElement hamb=driver.findElement(By.id("react-burger-menu-btn"));

        hamb.click();

        Thread.sleep(2000);

       // Not Working
        // WebElement about = driver.findElement(By.LinkText("https://saucelabs.com/"));
        //  WebElement about = driver.findElement(By.LinkText("saucelabs.com"));
        // WebElement about = driver.findElement(By.partialLinkText("saucelabs.com"));

        WebElement about = driver.findElement(By.xpath("//a[starts-with(@id,'about')]"));

        about.click();


        JavascriptExecutor js1= (JavascriptExecutor) driver; // Downcasting

        js1.executeScript("scroll(0,700)");

        Thread.sleep(3000);

        System.out.println("Scrolled 700 px");

        /*js1.executeScript("scroll(0,0)");

        Thread.sleep(3000);

        System.out.println("Scrolled 00 px");

        Thread.sleep(3000);*/

        WebElement sauceLabText = driver.findElement(By.xpath("//span[text()='© 2025 Sauce Labs Inc., all rights reserved. SAUCE and SAUCE LABS are registered trademarks owned by Sauce Labs Inc. in the United States, EU, and may be registered in other jurisdictions.']"));

        String companyAnnotation = sauceLabText.getText();

        System.out.println(companyAnnotation);

        WebElement slText = driver.findElement(By.xpath("//span[contains(text(),'© 2025 Sauce Labs')]"));

        // js1.executeScript("arguments[0],scrollIntoView(true);",slText); YOU FUCKING IDIOT ╰（‵□′）╯
       // js1.executeScript("arguments.scrollIntoView(true);",slText); javascript error: arguments.scrollIntoView is not a function
       // js1.executeScript("arguments.scrollIntoView(true);", slText);
        js1.executeScript("arguments[0].scrollIntoView(true);", slText);

        Thread.sleep(4000);

        System.out.println("Scrolled To the End ");

        Thread.sleep(4000);

        js1.executeScript("scroll(0,0)");

        driver.navigate().back();


        Select dropdown= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

        dropdown.selectByIndex(1);

        Thread.sleep(5000);


        driver.quit();







    }
}
