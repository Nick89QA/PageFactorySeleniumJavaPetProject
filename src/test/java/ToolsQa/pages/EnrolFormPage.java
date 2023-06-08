package ToolsQa.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;


public class EnrolFormPage extends BaseSeleniumPage {
    //WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 4);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//div/a[contains(@href, 'selenium-training?q=banner#enroll-form')]")
    private WebElement buttonEnrollYourself;

    @FindBy(xpath = "//div/input[@id='first-name']")
    private WebElement inputFieldFirstName;

    @FindBy(xpath = "//div/input[@id='last-name']")
    private WebElement inputFieldLastName;

    @FindBy(xpath = "//div/input[@id='email']")
    private WebElement inputFieldEmail;

    @FindBy(xpath = "//div/input[@id='mobile']")
    private WebElement inputFieldMobile;

    @FindBy(xpath = "//div/input[@id='city']")
    private WebElement inputFieldCity;

    @FindBy(xpath = "//div/textarea[@id='message']")
    private WebElement inputFieldYourMessage;

    @FindBy(xpath = "//div/select[@id='country']")
    private WebElement dropDownListSelectCountry;

    @FindBy(xpath = "//select[@name = 'country']/option[text() = 'United Kingdom']")
    private WebElement UnitedKingdomCountry;


    //  @FindBy(id = "//*[@id='nf-label-field-1791']")
    //  private WebElement checkBoxPer


    public EnrolFormPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);

    }

    /**
     * this method fill the form on Enrol page
     */

    public EnrolFormPage fillTheEnrollForm(String firstNameValue,
                                           String lastNameValue, String emailValue,
                                           String mobileValue, String cityValue, String messageText) {

        wait.until(ExpectedConditions.visibilityOf(buttonEnrollYourself)).click();

        js.executeScript("window.scrollTo(200, 0)");
        wait.until(ExpectedConditions.visibilityOf(inputFieldFirstName)).sendKeys(firstNameValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldLastName)).sendKeys(lastNameValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldEmail)).sendKeys(emailValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldMobile)).sendKeys(mobileValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldCity)).click();
        wait.until(ExpectedConditions.visibilityOf(UnitedKingdomCountry)).click();
        wait.until(ExpectedConditions.visibilityOf(inputFieldCity)).sendKeys(cityValue);
        wait.until(ExpectedConditions.visibilityOf(inputFieldYourMessage)).sendKeys(messageText);


        js.executeScript("window.scrollTo(0, 200)");
        js.executeScript("arguments[0].scrollIntoView(true);", inputFieldFirstName);

        return this;
    }


}

