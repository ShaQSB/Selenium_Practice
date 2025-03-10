import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GlobalSQA_07_03_25 {

    public static void popups(WebDriver driver){

      try {
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
          WebElement closeAd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Close']")));
          closeAd.click();
          System.out.println("Ad closed");
      }
      catch (Exception e){
          System.out.println("Ad Not closed or no pop-up found");
      }

    }

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

   /*     popups(driver);

        JavascriptExecutor je= (JavascriptExecutor) driver;

        je.executeScript("scroll(0,400)");

        WebElement dd_Btn=driver.findElement(By.xpath("//a[text()='DropDown']"));

        dd_Btn.click();

        popups(driver);*/

        /*WebElement dropDown=driver.findElement(By.xpath("//select"));

        dropDown.click();*/


        WebElement dd_Btn=driver.findElement(By.xpath("//select"));

        Select dropDown=new Select(dd_Btn);

        List<WebElement> options= dropDown.getOptions();

        List list=new ArrayList<>();

        System.out.println(options.size());

        for (WebElement option: options){

            String data= option.getText();

             list.add(data);

             // System.out.println(list); here everytime the list is printed. I just want the final list
        }

        System.out.println(list);

        int count=0;

        List<String> temp = new ArrayList<>(list);



        Collections.sort(temp,String.CASE_INSENSITIVE_ORDER);

        //Collections.reverseOrder(temp);


        for(int i=0;i<options.size();i++){

            if(list.get(i).equals(temp.get(i))){
                count++;
            }
        }

        System.out.println(count);
        System.out.println(temp.get(1));
        System.out.println(list.get(1));


















    }
}
