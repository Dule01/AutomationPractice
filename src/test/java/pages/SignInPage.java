package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage extends CommonActions{
    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#email_create#email_create")
    WebElement emailAddressBar;

    @FindBy(css = "#SubmitCreate")
    WebElement createAccBtn;

    public void createAcc(String validEmail){
        typeText(emailAddressBar, validEmail);
        clickElement(createAccBtn);
    }

    @FindBy(css = "#email")
    WebElement signInEmailBar;

    @FindBy(css = "#passwd")
    WebElement passBar;

    @FindBy(css = ".lost_password.form-group")
    WebElement lostPassLink;

    @FindBy(css = "#SubmitLogin")
    WebElement submitLoginBtn;

    @FindBy(css = ".info-account")
    WebElement myAccount;

    public void signInSuccessfully(String email, String password){
        typeText(signInEmailBar, email);
        typeText(passBar, password);
        clickElement(submitLoginBtn);
        String myAccText = myAccount.getText();
        Assert.assertEquals(myAccText, "Welcome to your account. Here you can manage all of your personal information and orders.");
    }














}
