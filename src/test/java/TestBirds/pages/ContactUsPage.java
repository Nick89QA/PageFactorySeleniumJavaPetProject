package TestBirds.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Set;

public class ContactUsPage extends BaseSeleniumPage {


    @FindBy(xpath = "//*[@id = 'tru_accept_btn']")
    private WebElement buttonAcceptAll;
    @FindBy(xpath = "//div/p/a[@target='_self']")
    private WebElement buttonContactUs;
    @FindBy(xpath = "//*[@class='nf-field-element form-floating' ]//*[@id = 'nf-field-1787']")
    private WebElement inputFieldFirstName;

    @FindBy(xpath = "//*[@id='nf-field-1788']")
    private WebElement inputFieldLastName;

    @FindBy(xpath = "//*[@id='nf-field-1788']")
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


    public  ContactUsPage fillTheForm(String firstNameValue) {
        buttonContactUs.click();

        inputFieldFirstName.click();
        inputFieldFirstName.sendKeys(firstNameValue);

        return this;




    }

}

