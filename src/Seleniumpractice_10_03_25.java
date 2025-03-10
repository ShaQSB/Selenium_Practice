import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Seleniumpractice_10_03_25 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@id='menu1']")).click();

        List<WebElement> dd_Menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));

        for(WebElement ele:dd_Menu){

          String innerhtml= ele.getAttribute("innerHTML");

          if(innerhtml.equalsIgnoreCase("about us")){
              ele.click();
             // break; // Applying a break so that i
              // wont get an error as the page is redirected
          }

          System.out.println("Element===========>"+ele.getText());


        }

        driver.quit();


    }
}
