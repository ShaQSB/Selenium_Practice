import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        String s="Sjahvsd";

        String pwd="lasnkdlkjasnd";

        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement passWord= driver.findElement(By.xpath("//input[@id='password']"));

        WebElement signIn = driver.findElement(By.id("log-in"));


        userName.sendKeys(s);

        passWord.sendKeys(pwd);

        Thread.sleep(5000);

        signIn.click();

        System.out.println("Clicked");

        driver.quit();

    }
}
