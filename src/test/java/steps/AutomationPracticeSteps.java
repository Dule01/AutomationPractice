package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import tests.BaseTest;

public class AutomationPracticeSteps extends BaseTest {

    @Before
    public void setUp() {
        init("CHROME", 15);
    }

    @Given("The user opens the browser and navigates to the website Homepage")
    public void theUserOpensTheBrowserAndNavigatesToTheWebsiteHomepage() {
        driver.get("http://automationpractice.com/index.php");
    }

    @When("The user clicks on the Sign In Button")
    public void theUserClicksOnTheSignInButton() {
        BasePage bp = new BasePage(driver);
        bp.verifySignInBtn();
    }

    @Then("The Sign In page appears")
    public void theSignInPageAppears() {
        BasePage bp = new BasePage(driver);
        bp.verifySignInBtn();
    }

    @After
    public void tearDown() {
        quitBrowser();
    }


}
