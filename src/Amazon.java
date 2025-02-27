import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Amazon {
    /*static WebDriver wb;
    String no="9900131902";
    String pwds="Shakthi@1853";*/

    //static  void webAccess(){

/*
    }
     void signInBtn() throws InterruptedException {
      *//* //WebElement signIn= wb.findElement(By.linkText("/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang"));
        WebElement signIn=wb.findElement(By.id("nav-link-accountList"));
        Thread.sleep(5000);
        signIn.click();*//*
    }

    void email(){
        *//*WebElement email=wb.findElement(By.xpath("//input[@id='ap_email']"));
        email.sendKeys(no);
        WebElement cntnue= wb.findElement(By.xpath("//input[@id='continue']"));
        cntnue.click();*//*
    }

    void pwd(){
        WebElement pwd=wb.findElement(By.xpath("//input[@id='ap_password']"));
        pwd.sendKeys(pwds);
        WebElement signIn_Btn = wb.findElement(By.xpath("//input[@id='signInSubmit']"));
        signIn_Btn.click();
    }*/


    public static void main(String[] args) throws InterruptedException {

        WebDriver wb;
        String no="9900131902";
        String pwds="Shakthi@1853";

         wb= new ChromeDriver();
         wb.get("https://www.amazon.in/");
        //wb.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
        wb.manage().window().maximize();

        //WebElement signIn= wb.findElement(By.linkText("/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang"));
        WebElement signIn=wb.findElement(By.id("nav-link-accountList"));
        //Thread.sleep(5000); wait concepts which one of the best waits are to be inserted with explanation
        signIn.click();


        WebElement email=wb.findElement(By.xpath("//input[@name='email']")); // Locator and Xpath important
        email.sendKeys(no);

        WebElement cntnue= wb.findElement(By.xpath("//input[@type='submit']"));
        cntnue.click();

        WebElement pwd=wb.findElement(By.xpath("//input[@name='password']"));
        pwd.sendKeys(pwds);

        WebElement signIn_Btn = wb.findElement(By.xpath("(//input[@type='submit'])[1]"));

        signIn_Btn.click();

        // Find the Page title and then display it in console

        // Scroll down to bottom and find the web page
        // 1996-2025, Amazon.com, Inc. or its affiliates xpath and print it in console

        // HOVER onto the En language option and change language of the webpage



       // Amazon A=new Amazon();
       // webAccess();
       // A.signInBtn();
       // A.email();
       // A.pwd();
        //Thread.sleep(10000);
       // wb.quit();



    }
}
