package utils.application;

import org.openqa.selenium.WebDriver;
import pages.PageCarvanaHome;

public class CarvanaHomePage {
    public PageCarvanaHome pageCarvanaHome = new PageCarvanaHome();

    public boolean launchCarvanaApplication(){
        pageCarvanaHome.getCarvanaHomePage();
        return pageCarvanaHome.verifyHomePage();

    }

}
