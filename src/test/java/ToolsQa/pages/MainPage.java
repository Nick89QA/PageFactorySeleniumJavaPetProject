package ToolsQa.pages;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;

public class MainPage extends BaseSeleniumPage {

    WebDriverWait wait = new WebDriverWait(driver, 4);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(xpath = "//div/a[contains(@class, 'new-training__read-more')]")
    private WebElement buttonReadMore;

    @FindBy(xpath = "//div/a[contains(@href, '/articles')]")
    private WebElement buttonLatestArticles;

    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Demo Site']")
    private WebElement buttonDemoSite;

    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'About']")
    private WebElement buttonAbout;

    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Selenium Training']")
    private WebElement buttonSeleniumTraining;

    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Home']")
    private WebElement buttonHome;

    @FindBy(xpath = "//div/form/input[@class='navbar__search--input']")
    private WebElement inputSearch;

    @FindBy(xpath = "//div[text()='How to handle web tables using testRigor?']")
    private WebElement articleHowToHandle;

    @FindBy(xpath = "//span[@class='name text-tools-qa-black']")
    private WebElement assertAuthorHarishRajora;

    @FindBy(xpath = "//div/a/span[@class='navbar__tutorial-menu--menu-bars']")
    private WebElement buttonTutorials;

    @FindBy(xpath = "//div/span[text()='QA Practices']")
    private WebElement buttonQaPractices;

    @FindBy(xpath = "//div/span[text()='Front-End Testing Automation']")
    private WebElement buttonFrontEndTestingAuto;

    @FindBy(xpath = "//div/span[text()='Back-End Testing Automation']")
    private WebElement buttonBackEndTestingAuto;

    @FindBy(xpath = "//div/span[text()='Mobile Testing Automation']")
    private WebElement buttonMobileTestingAutomation;

    @FindBy(xpath = "//div/span[text()='Frameworks & Libraries']")
    private WebElement buttonFrameworksAndLibraries;

    @FindBy(xpath = "//div/span[text()='DevOps Tools']")
    private WebElement buttonDevopsTools;

    @FindBy(xpath = "//div/span[text()='Cross Browser Testing']")
    private WebElement buttonCrossBrowserTesting;

    @FindBy(xpath = "//div/span[text()='Non-Functional Testing']")
    private WebElement buttonNonFunctionalTesting;

    @FindBy(xpath = "//div/span[text()='Programming Language']")
    private WebElement buttonProgrammingLanguage;

    @FindBy(xpath = "//div/ul/li/a[@title='ISTQB Preparation']")
    private WebElement linkIsqtbPreparation;

    @FindBy(xpath = "//div/ul/li/a[@title='Software Testing']")
    private WebElement linkSoftwareTesting;

    @FindBy(xpath = "//div/ul/li/a[@title='Agile & Scrum']")
    private WebElement linkAgileScrum;

    @FindBy(xpath = "//div/ul/li/a[@title='Cypress']")
    private WebElement linkCypress;

    @FindBy(xpath = "//div/ul/li/a[@title='Protractor']")
    private WebElement linkProtractor;

    @FindBy(xpath = "//div/ul/li/a[@title='Selenium in Java']")
    private WebElement linkSeleniumInJava;

    @FindBy(xpath = "//div/ul/li/a[@title='TestProject']")
    private WebElement linkTestProject;

    @FindBy(xpath = "//div/ul/li/a[@title='Katalon Studio']")
    private WebElement linkKatalonStudio;

    @FindBy(xpath = "//div/ul/li/a[@title='Selenium C Sharp']")
    private WebElement linkSeleniumCSharp;

    @FindBy(xpath = "//div/ul/li/a[@title='Rest Assured']")
    private WebElement linkRestAssured;

    @FindBy(xpath = "//div/ul/li/a[@title='Postman']")
    private WebElement linkPostman;

    @FindBy(xpath = "//div/ul/li/a[@title='SOAPUI']")
    private WebElement linkSoapUi;





    public MainPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);
    }

    /**
     * this method fill input search  key word "selenium" and open the article on the search page
     */
    public MainPage searchArticleOnTheMainPage(String searchValue) {
        wait.until(ExpectedConditions.visibilityOf(inputSearch)).sendKeys(Keys.ENTER, searchValue);
        wait.until(ExpectedConditions.visibilityOf(articleHowToHandle)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", assertAuthorHarishRajora);
        System.out.println("--The author in this article -- " + wait.until(ExpectedConditions.visibilityOf(assertAuthorHarishRajora)).getText());
        return this;
    }

    /**
     * this method check links in drop down menu Qa practices
     */
    public MainPage goToLinksInDropDownMenuQaPractices() {
        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonQaPractices)).click();
        wait.until(ExpectedConditions.visibilityOf(linkIsqtbPreparation)).click();
        Assert.assertEquals("url ISTQB Foundation", ConfigProvider.URL_ISTQB_FOUNDATION, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonQaPractices)).click();
        wait.until(ExpectedConditions.visibilityOf(linkSoftwareTesting)).click();
        Assert.assertEquals("url Software testing", ConfigProvider.URL_SOFTWARE_TESTING, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonQaPractices)).click();
        wait.until(ExpectedConditions.visibilityOf(linkAgileScrum)).click();
        Assert.assertEquals("url AgileScrum", ConfigProvider.URL_AGILE_SCRUM, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();
        return this;
    }

    /**
     * this method check links in drop down menu Qa practices
     */

    public MainPage goToLinksInDropDownMenuFrontEndTestingAuto() {
        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkCypress)).click();
        Assert.assertEquals("url Cypress", ConfigProvider.URL_CYPRESS, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkProtractor)).click();
        Assert.assertEquals("url Protractor", ConfigProvider.URL_PROTRACTOR, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkSeleniumInJava)).click();
        Assert.assertEquals("url SeleniumInJava", ConfigProvider.URL_SELENIUM_IN_JAVA, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkTestProject)).click();
        Assert.assertEquals("url TestProject", ConfigProvider.URL_TEST_PROJECT, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkKatalonStudio)).click();
        Assert.assertEquals("url linkKatalonStudio", ConfigProvider.URL_KATALON_STUDIO, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkSeleniumCSharp)).click();
        Assert.assertEquals("url SeleniumCSharp", ConfigProvider.URL_SELENIUM_C_SHARP, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();
        return this;

    }

    public MainPage goToLinksInDropDownMenuBackEndTestAuto() {
        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkRestAssured)).click();
        Assert.assertEquals("url RestAssured", ConfigProvider.URL_REST_ASSURED, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkPostman)).click();
        Assert.assertEquals("url Postman", ConfigProvider.URL_POSTMAN, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        wait.until(ExpectedConditions.visibilityOf(buttonTutorials)).click();
        wait.until(ExpectedConditions.visibilityOf(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.visibilityOf(linkSoapUi)).click();
        Assert.assertEquals("url SoapUi", ConfigProvider.URL_SOAPUI, driver.getCurrentUrl());
        wait.until(ExpectedConditions.visibilityOf(buttonHome)).click();

        return this;
    }



}
