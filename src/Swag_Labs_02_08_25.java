import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swag_Labs_02_08_25 {

    public static void main(String[] args) throws InterruptedException {



        String un="standard_user";

        String pwd="secret_sauce";

        WebDriver driver= new ChromeDriver();

        // Opens URL
        driver.get("https://www.saucedemo.com/");

        WebElement userName=driver.findElement(By.id("user-name"));

        userName.sendKeys(un);

        WebElement passwd= driver.findElement(By.name("password"));

        passwd.sendKeys(pwd);

        Thread.sleep(3000);


        WebElement submit=driver.findElement(By.className("submit-button btn_action"));

        submit.click();

        Thread.sleep(5000);

        String Title = driver.getTitle();

        System.out.println(Title);

        Select dropdown= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));


        dropdown.selectByIndex(3);
//
//        dropdown.selectByVisibleText("");
//
//        Thread.sleep(7000);
//
//        Select dropdown1= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//
//        dropdown1.selectByValue("hilo");
//
//        Thread.sleep(7000);
//
//        Select dropdown2= new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
//
//        dropdown2.selectByVisibleText("Price (low to high)");
//
//        Thread.sleep(7000);
//
        WebElement hamb=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));

        hamb.click();

//        Thread.sleep(7000);

        WebElement logout=driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));

        logout.click();

        Thread.sleep(7000);


        driver.quit();




    }



}
