import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.Layer;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice_Expand_05_03_25 {


    public static void main(String[] args) throws  InterruptedException{
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.expandtesting.com/radio-buttons");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        JavascriptExecutor je=(JavascriptExecutor) driver;

        je.executeScript("scroll(0,500)");

        List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));

        for (int i = 0; i < radio.size(); i++) {

            WebElement lcradio=radio.get(i);

           // String text= lcradio.getText();
            // Not working because there is no text wrt to input radio


            String attribute= lcradio.getAttribute("id");

            //System.out.println(text);

            System.out.println(attribute);

            if(attribute.contains("red") ){

                lcradio.click();


            }

            if(attribute.equalsIgnoreCase("football")){

                lcradio.click();
            }


        }

        System.out.println(radio.size());

        Thread.sleep(7000);

        /*driver.findElement(By.xpath("//a[text()='Home']")).click();

        driver.findElement(By.xpath("//a[@href='/checkboxes' and text()='Try it out']")).click();
*/
        driver.navigate().to("https://practice.expandtesting.com/checkboxes");

        List<WebElement> chkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));

        WebElement lbl1,lbl2;
        String lbl1_1,lbl2_2;

        je.executeScript("scroll(0,500)");

        lbl1=driver.findElement(By.xpath("//label[contains(text(),'Checkbox 1')]"));

        lbl1_1=lbl1.getAttribute("for");

        lbl2=driver.findElement(By.xpath("//label[contains(text(),'Checkbox 2')]"));

        lbl2_2=lbl2.getAttribute("for");



        boolean chkselt=false;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));



        for (int i = 0; i < chkbox.size(); i++) {

            System.out.println(chkselt);

            WebElement lck=chkbox.get(i);

            wait.until(ExpectedConditions.elementToBeClickable(lck)).click();


            String lck1= lck.getAttribute("id");

            if(lck1.equalsIgnoreCase(lbl1_1) || lck1.equalsIgnoreCase(lbl2_2)){

                Thread.sleep(5000);

                lck.click();

                Thread.sleep(5000);


                chkselt=true;


            }

        }

        System.out.println(chkselt);

        if(!chkselt){
            System.out.println("Checkbox not selected");
        }


       // driver.quit();
    }


}
