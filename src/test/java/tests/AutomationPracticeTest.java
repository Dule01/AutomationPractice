package tests;

import io.qameta.allure.Description;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SignInPage;

public class AutomationPracticeTest extends BaseTest {

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(String browser){
        init(browser, 15);
    }

    @Test(description = "Verify functionality of the 'Contact Us' button")
    @Description("The 'Contact Us' button properly works and navigates the user to the Contact Page")
    public void verifyContactUsBtn(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.verifyContactUsBtn();
    }

    @Test(description = "Verify functionality of the 'Sign In' button")
    @Description("The 'Sign In' button properly works and navigates the user to the Sign In Page")
    public void verifySignInBtn(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.verifySignInBtn();
    }

    @Test(description = "Verify functionality of the footer Information links")
    @Description("Links under the 'Information' category at the bottom of the screen properly function")
    public void verifyFooterInfoLinks(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.selectFooterInformationLink("Sitemap");
    }

    @Test(description = "Verify functionality of the footer My Account links")
    @Description("Links under the 'My Account' category at the bottom of the screen properly function")
    public void verifyFooterMyAccLinks(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.selectFooterMyAccountLink("My orders");
    }

    @Test(description = "Verify Newsletter Bar")
    @Description("The Newsletter Bar properly functions after entering a valid email address")
    public void verifyNewsletter(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.enterNewsletterEmail("testemail"+System.currentTimeMillis()+"@email.com");
    }

    @Test(description = "Verify social media buttons")
    @Description("All of the social media buttons properly function")
    public void socialButtons(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.checkSocialButtons();
    }

    @Test(description = "Verify email link")
    @Description("Footer email link is functional")
    public void emailLink(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.verifyEmail();
    }

    @Test(description = "Verify text for invalid email")
    @Description("Error text for an invalid email is valid")
    public void invalidEmailNewsletter(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.enterInvalidNewsletterEmail("invalidemail");
    }

    @Test(description = "Verify text for repeated email")
    @Description("Error text for an already used email is valid")
    public void repeatedEmailNewsletter(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.identicalEmail("email1@email.com");
    }

    @Test(description = "Verify sign in option")
    @Description("The sign in option is functional with proper credentials and leads to the My Account page")
    public void signIn(){
        driver.get("http://automationpractice.com/index.php");
        BasePage bp = new BasePage(driver);
        bp.verifySignInBtn();

        SignInPage sp = new SignInPage(driver);
        sp.signInSuccessfully("testemail@email.com", "password");
    }

    @AfterMethod
    public void tearDown(){
        quitBrowser();
    }
}
