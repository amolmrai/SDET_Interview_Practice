package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.application.CarvanaHomePage;
import utils.framework.DriverManager;

public class StepCarvanaHomePage {
    CarvanaHomePage carvanaHomePage = new CarvanaHomePage();

    @Given("I launch browser with carvana application")
    public void i_launch_browser_with_carvana_application() {
        Assert.assertFalse("PASSED::Succussfully validated carvana home page", carvanaHomePage.launchCarvanaApplication());
    }
    @Then("close browser")
    public void close_browser() {
        DriverManager.killBrowser();
    }

}
