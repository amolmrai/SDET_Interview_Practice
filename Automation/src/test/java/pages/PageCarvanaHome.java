package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.framework.DriverManager;

public class PageCarvanaHome {
    // get webdriver
    WebDriver driver = DriverManager.getWebDriver();
    public String homepageLogo = "//div[contains(@data-qa,'logo')]";
    public WebDriver getCarvanaHomePage(){
        driver.get("https://www.carvana.com/");
        return driver;
    }

    public boolean verifyHomePage(){
        boolean isVerifyHomePage =false;
        //Validate home page is loaded or not.
        WebElement homeLogo = driver.findElement(By.xpath(homepageLogo));
        if(!homeLogo.isDisplayed()){
            return  false;
        }
        return isVerifyHomePage;
    }


}
