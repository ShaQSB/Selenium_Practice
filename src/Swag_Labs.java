import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Swag_Labs {

    static String un="standard_user";
    static String pwds="secret_sauce";

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver=new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();

        WebElement userName= driver.findElement(By.xpath("//input[@name='user-name']"));

        userName.sendKeys(un);
        Thread.sleep(3000);

        WebElement pwd= driver.findElement(By.xpath("//input[@name='password']"));

        pwd.sendKeys(pwds);
        Thread.sleep(3000);

        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));

        login.click();

        Thread.sleep(5000);

        String title = driver.getTitle();

        System.out.println(title);

        Select s1= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

        s1.selectByIndex(1);

        Thread.sleep(3000);

        Select s2= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

        s2.selectByValue("lohi");

        Thread.sleep(3000);

        Select s3= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));

        s3.selectByVisibleText("Price (high to low)");

        Thread.sleep(7000);

        WebElement hamb= driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));

        hamb.click();

        Thread.sleep(5000);

        WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));

        logout.click();

        Thread.sleep(5000);

        driver.close();
    }
}
