package reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Implementation {
   WebDriver driver;
   public Implementation(){
       createDriver();
       PageFactory.initElements(driver, this);
   }
   public static String applicationURL="https://jupiter.cloud.planittesting.com/";

   @FindBy(xpath="//input[@id='loginUserName']")
   public static WebElement UserName;

   @FindBy(linkText = "Login")
   public static WebElement LoginPage;

   @FindBy(xpath = "//input[@id='loginPassword']")
   public static WebElement Password;

   @FindBy(xpath ="//button[contains(text(),'Login')]" )
   public static WebElement LoginButton;

   @FindBy(xpath = "//div[@id='login-error']")
   public static WebElement LoginErrorMessage;



   //methods
     public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver103");
        driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
         driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
    }

    public void navigateToApplication(){
         driver.get(applicationURL);
    }

    public void loginPage(){
         try {
             LoginPage.click();
             UserName.sendKeys("Sravani");
             Password.sendKeys("ABC@123");
             LoginButton.click();
//             driver.wait(20000);
             if(LoginErrorMessage.isDisplayed()){
                 System.out.println("Error message displayed");
             }
         }catch (Exception ex){
             System.out.println("Exception Found inside of Login Page-"+ex);
         }
    }


    public void closeDriver(){
         driver.close();
    }

}
