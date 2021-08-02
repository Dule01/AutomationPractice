package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonActions {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#id_gender1")
    WebElement maleGenderBtn;

    @FindBy(css = "#id_gender2")
    WebElement femaleGenderBtn;

    public void selectMaleGender(){
        clickElement(maleGenderBtn);
    }

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    public void enterNames(String firstNameValue, String lastNameValue){
        typeText(firstName, firstNameValue);
        typeText(lastName, lastNameValue);
    }

    @FindBy(css = "#passwd")
    WebElement password;

    public void enterPassword(String passwordValue){
        typeText(password, passwordValue);
    }

    @FindBy(css = "#days")
    WebElement selectDay;

    @FindBy(css = "#months")
    WebElement selectMonth;

    @FindBy(css = "#years")
    WebElement selectYear;

    public void setDateOfBirth(){
       selectByValue(selectDay, "1");
       selectByValue(selectMonth, "8");
       selectByValue(selectYear, "1995");
    }

    @FindBy(css = ".account_creation #firstname")
    WebElement anotherFirstName;

    @FindBy(css = ".account_creation #lastname")
    WebElement anotherSecondName;

    @FindBy(css = "[name=\"company\"]")
    WebElement company;

    @FindBy(css = "#address1")
    WebElement address1;

    @FindBy(css = "#address2")
    WebElement address2;

    @FindBy(css = "#city")
    WebElement city;

    public void enterAddressData(String firstName, String lastName, String companyValue, String address1Value,
                                 String address2Value, String cityValue){
        typeText(anotherFirstName, firstName);
        typeText(anotherSecondName, lastName);
        typeText(company, companyValue);
        typeText(address1, address1Value);
        typeText(address2, address2Value);
        typeText(city, cityValue);
    }

    @FindBy(css = "#id_state")
    WebElement selectStateBtn;

    public void selectState(){
        selectByText(selectStateBtn, "California");
    }

    @FindBy(css = "#postcode")
    WebElement postCode;

    public void setPostCode(String postCodeValue){
        typeText(postCode, postCodeValue);
    }

    @FindBy(css = "#other")
    WebElement additionalInfo;

    public void writeAdditionalInfo(String textValue){
        typeText(additionalInfo, textValue);
    }

    @FindBy(css = "#phone")
    WebElement phone1;

    @FindBy(css = "#phone_mobile")
    WebElement phoneMobile;

    public void enterPhoneNumbers(String home, String mobile){
        typeText(phone1, home);
        typeText(phoneMobile, mobile);
    }

    @FindBy(css = "#alias")
    WebElement anotherAddress;

    public void writeAnotherAddress(String addressValue){
        typeText(anotherAddress, addressValue);
    }

    @FindBy(css = "#submitAccount")
    WebElement submitAccBtn;

    public void confirmRegistration(){
        clickElement(submitAccBtn);
    }






























}
