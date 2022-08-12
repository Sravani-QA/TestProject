package reusable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Implementation {
   WebDriver driver;
   public Implementation(){
       createDriver();
       PageFactory.initElements(driver, this);
   }
   public static String applicationURL="https://jupiter.cloud.planittesting.com/";

   @FindBy(xpath="")
   public static WebElement ShoppingButton;

   //methods
     public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver103");
        driver=new ChromeDriver();

    }

    public void navigateToApplication(){
         driver.get(applicationURL);
    }

    public void closeDriver(){
         driver.close();
    }

}
