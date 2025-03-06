import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Swag_Labs_06_03_25 {

    public static void main(String[] args) throws InterruptedException {


        String user,pass;

        user="standard_user";

        pass="secret_sauce";

        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.saucedemo.com/");


        WebElement un,pwd,lgn,product_DropDown;

        un=driver.findElement(By.xpath("//input[@id='user-name']"));

        pwd=driver.findElement(By.xpath("//input[@id='user-name']//following::input"));

        un.sendKeys(user);

        pwd.sendKeys(pass);

        lgn=driver.findElement(By.xpath("//input[@id='login-button']"));

        ;lgn.click();

        product_DropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));

        Select product_DD= new Select(product_DropDown);

        System.out.println(product_DD.getFirstSelectedOption().getText());

        Thread.sleep(5000);

        /*product_DD.selectByValue("lohi");

        Thread.sleep(5000 );*/

        //So I get a stale element reference exception because when the website gets refreshed
        // from the selected value A to Z to the low to high price option the reference of the
        // variable gets empty and hence get refreshed into an empty container and because of that
        // the stale element reference exception

        //To overcome this either reassign the variable value
        // or
        // user try catch block which is the better option than the prior

       /* product_DropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        product_DD=new Select(product_DropDown);
       */

        try{
            product_DD.selectByValue("lohi");

            Thread.sleep(5000 );

            System.out.println(product_DD.getFirstSelectedOption().getText());


        }catch (StaleElementReferenceException e){

            product_DropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));

            product_DD=new Select(product_DropDown);

            System.out.println(product_DD.getFirstSelectedOption().getText());


        }

        //List<WebElement> product_DropDowns=driver.findElements(By.xpath("//select[@class='product_sort_container']"));

        //So here if I'm using product_DropDowns and assigning the X path of the select tag I am going to get only one as the 
        // value of my size() because there is only one select tag
        // but in the select tag the options are 4 
        // so I directly go for the options rather than the select tag 


        List<WebElement> options= product_DD.getOptions();
        
        int count=0;

        System.out.println(options.size());


        for (int i = 0; i <options.size() ; i++) {

            WebElement list=options.get(i);
            System.out.println(list.getText());

            count++;

        }

        if(count==options.size()){

            System.out.println(count);
        }


    }
}
