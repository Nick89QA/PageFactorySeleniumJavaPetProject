package TestBirds.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class ContactUsPage extends BaseSeleniumPage {


    @FindBy(xpath = "//*[@id = 'tru_accept_btn']")
    private WebElement buttonAcceptAll;
    @FindBy(xpath = "//div/p/a[@target='_self']")
    private WebElement buttonContactUs;
    @FindBy(xpath = "//*[@class='nf-field-element form-floating' ]//*[@id = 'nf-field-1787']")
    private WebElement inputFieldFirstName;

    @FindBy(xpath = "//*[@id='nf-field-1788']")
    private WebElement inputFieldLastName;

    @FindBy(xpath = "//input[@id='nf-field-1792']")
    private WebElement inputFieldCompany;

    @FindBy(xpath = "//*[@id='nf-field-1785']")
    private WebElement inputFieldEmail;

    @FindBy(xpath = "//*[@id='nf-field-1789']")
    private WebElement inputFieldPhone;

    @FindBy(xpath = "//*[@id='nf-field-1794']")
    private WebElement inputFieldCoverLetter;



    public ContactUsPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);
    }


    public  ContactUsPage fillTheForm(String firstNameValue, String lastNameValue, String companyName,
                                      String mailValue, String mobilePhoneValue, String coverLetterValue) {
        buttonContactUs.click();
        inputFieldFirstName.sendKeys(firstNameValue);
        inputFieldLastName.sendKeys(lastNameValue);
        inputFieldCompany.sendKeys(companyName);
        inputFieldEmail.sendKeys(mailValue);
        inputFieldPhone.sendKeys(mobilePhoneValue);
        inputFieldCoverLetter.sendKeys(coverLetterValue);
        return this;




    }

}

