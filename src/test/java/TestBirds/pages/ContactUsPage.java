package TestBirds.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;


public class ContactUsPage extends BaseSeleniumPage {
    WebDriverWait wait = new WebDriverWait(driver, 4);
    JavascriptExecutor js = (JavascriptExecutor) driver;


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

    @FindBy(xpath = "//*[@id='nf-label-field-1790']")
    private WebElement checkBoxDataPrivacyStatement;

    //  @FindBy(id = "//*[@id='nf-label-field-1791']")
    //  private WebElement checkBoxPer


    public ContactUsPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);

    }


    /**
     * this method fill the form on Contact Us page
     */
    public ContactUsPage fillTheForm(String firstNameValue, String lastNameValue, String companyName,
                                     String mailValue, String mobilePhoneValue, String coverLetterValue) {

        wait.until(ExpectedConditions.visibilityOf(buttonContactUs)).click();
        js.executeScript("window.scrollBy(0, 450)");
        wait.until(ExpectedConditions.visibilityOf(inputFieldFirstName)).sendKeys(firstNameValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldFirstName)).sendKeys(lastNameValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldCompany)).sendKeys(companyName);
        wait.until(ExpectedConditions.visibilityOf(inputFieldEmail)).sendKeys(mailValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldPhone)).sendKeys(mobilePhoneValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldCoverLetter)).sendKeys(coverLetterValue);
        return this;
    }


}

