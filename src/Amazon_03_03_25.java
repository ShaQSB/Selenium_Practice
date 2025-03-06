import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Amazon_03_03_25 {

    // Find the Page title and then display it in console

    // Scroll down to bottom and find the web page
    // 1996-2025, Amazon.com, Inc. or its affiliates xpath and print it in console

    // HOVER onto the En language option and change language of the webpage


    public static void main(String[] args) throws InterruptedException {


        String user="9900131902";

        String passwd="Shakthi@1853";

        WebDriver driver = new ChromeDriver();

        driver .manage().window().maximize();

        driver.get("https://www.amazon.in/");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.getTitle();

        WebElement scrolToBot= driver.findElement(By.xpath("//span[starts-with(text(),'© ')]"));

        JavascriptExecutor je=(JavascriptExecutor) driver;

        je.executeScript("arguments[0].scrollIntoView(true);",scrolToBot);

        String footertext= String.valueOf(scrolToBot);

        System.out.println(footertext);

        Thread.sleep(5000);


        je.executeScript("scroll(0,0)");

        System.out.println("Scrolled to Top");

        WebElement lang=driver.findElement(By.xpath("//div[text()='EN']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(lang).perform();

        Thread.sleep(5000);

        WebElement langselect= driver.findElement(By.xpath("//span[@style='unicode-bidi:isolate; direction:ltr;'][text()='ಕನ್ನಡ']"));

        Thread.sleep(3000);

        langselect.click();

        Thread.sleep(3000);

        WebElement loginhover=driver.findElement(By.cssSelector("a[data-nav-role='signin']"));

        actions.moveToElement(loginhover).perform();

        Thread.sleep(5000);


        WebElement signin=driver.findElement(By.cssSelector("span[class='nav-action-inner']"));

        signin.click();


        WebElement un=driver.findElement(By.xpath("//input[starts-with(@type,'email')]"));

        un.sendKeys(user);

        WebElement cntnue= driver.findElement(By.xpath("//input[@type='submit']"));

        cntnue.click();

        WebElement pwd=driver.findElement(By.xpath("//input[@type='password' ]"));

        pwd.sendKeys(passwd);

        WebElement login = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));

        login.click();

    }
}
