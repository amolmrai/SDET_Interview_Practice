
package utils.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 public class  DriverManager {
    static WebDriver driver;

    public static WebDriver getWebDriver(){
        if(null == driver){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    return driver;
    }

    public void launchApplication(){
        DriverManager dm = new DriverManager();
        WebDriver browser = DriverManager.getWebDriver();
        browser.get("https://www.irctc.co.in/nget/train-search");
    }

    public static void killBrowser(){
       try{
           if(driver !=null){
               driver.close();
           }
       }catch (Exception ex){
            System.out.println("Exception while closing driver "+ex);
       }finally {
           driver.close();
       }
    }
}
