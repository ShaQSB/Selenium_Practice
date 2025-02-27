import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_02_16_25 {

    public static void main(String[] args) throws InterruptedException {

        String no="9900131902";

        String pwd="Shakthi@1853";

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.in/");

        driver.manage().window().maximize();

        Thread.sleep(10000);

        WebElement sign = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

        sign.click();

        WebElement email=driver.findElement(By.xpath("//*[@name='email']"));

        email.sendKeys(no);

        Thread.sleep(2000);

        WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));

        cont.click();

        Thread.sleep(25000);

        WebElement pwds=driver.findElement(By.xpath("//input[@id='ap_password']"));

        pwds.sendKeys(pwd);

        WebElement signIn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));

        signIn.click();

        String title = driver.getTitle();

        System.out.println(title);


        //((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 1000)"); // Scroll down 1000 pixels at a time (adjust as needed)

        WebElement elementAtBottom = driver.findElement(By.xpath("//*[text()='© 1996-2025, Amazon.com, Inc. or its affiliates']"));
        //((JavascriptExecutor) driver).executeScript("arguments.scrollIntoView(true);", elementAtBottom); // Scroll to the element

        JavascriptExecutor js1= (JavascriptExecutor) driver;

        js1.executeScript("arguments.scrollIntoView(true);",elementAtBottom);

        String era= elementAtBottom.getText();

        System.out.println(era);


        WebElement elementAtTop = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


        JavascriptExecutor js2= (JavascriptExecutor) driver;

        js1.executeScript("arguments.scrollIntoView(true);",elementAtTop);




    }
}
