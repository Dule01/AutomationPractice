package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BasePage extends CommonActions{
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#contact-link")
    WebElement contactUsButton;

    @FindBy(css = ".page-heading.bottom-indent")
    WebElement contactUsText;

    public void verifyContactUsBtn(){
        clickElement(contactUsButton);
        String contactUsPageText = contactUsText.getText();
        Assert.assertEquals(contactUsPageText, "CUSTOMER SERVICE - CONTACT US");
    }

    @FindBy(css = ".login")
    WebElement signInButton;

    @FindBy(css = ".page-heading")
    WebElement authenticationText;

    public void verifySignInBtn(){
        clickElement(signInButton);
        String signInPageText = authenticationText.getText();
        Assert.assertEquals(signInPageText, "AUTHENTICATION");
    }

    public void selectFooterInformationLink(String informationLink){
        clickElement(driver.findElement(
                By.xpath("//*[@id=\"block_various_links_footer\"]//a[contains(text(), \""+informationLink+"\")]")));
    }

    public void selectFooterMyAccountLink(String myAccountLink){
        clickElement(driver.findElement(By.cssSelector(".block_content.toggle-footer [title=\""+myAccountLink+"\"]")));
    }

    @FindBy(css = "#newsletter-input")
    WebElement newsletterInput;

    @FindBy(css = ".alert.alert-success")
    WebElement validNewsletterSignUp;



    public void enterNewsletterEmail(String email){
        typeText(newsletterInput, email);
        newsletterInput.sendKeys(Keys.ENTER);
        String successText = validNewsletterSignUp.getText();
        Assert.assertEquals(successText, "Newsletter : You have successfully subscribed to this newsletter.");
    }






}
