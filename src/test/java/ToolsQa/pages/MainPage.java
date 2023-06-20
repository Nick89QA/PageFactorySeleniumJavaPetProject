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

import java.security.PublicKey;

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
    /**
     * Links from drop down menu
     */
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

    @FindBy(xpath = "//div/ul/li/a[@title='Appium Studio']")
    private WebElement linkAppiumStudio;

    @FindBy(xpath = "//div/ul/li/a[@title='Cucumber']")
    private WebElement linkCucumber;

    @FindBy(xpath = "//div/ul/li/a[@title='SpecFlow']")
    private WebElement linkSpecFlow;

    @FindBy(xpath = "//div/ul/li/a[@title='Junit']")
    private WebElement linkJunit;

    @FindBy(xpath = "//div/ul/li/a[@title='TestNG']")
    private WebElement linkTestNG;

    @FindBy(xpath = "//div/ul/li/a[@title='Extent report - Cucumber (TestNG)']")
    private WebElement linkCucumberTestNg;

    @FindBy(xpath = "//div/ul/li/a[@title='Maven']")
    private WebElement linkMaven;

    @FindBy(xpath = "//div/ul/li/a[@title='Git']")
    private WebElement linkGit;

    @FindBy(xpath = "//div/ul/li/a[@title='Docker']")
    private WebElement linkDocker;


    public MainPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);
    }

    /**
     * this method fill input search  key word "selenium" and open the article on the search page
     */
    public MainPage searchArticleOnTheMainPage(String searchValue) {
        wait.until(ExpectedConditions.elementToBeClickable(inputSearch)).sendKeys(Keys.ENTER, searchValue);
        wait.until(ExpectedConditions.elementToBeClickable(articleHowToHandle)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", assertAuthorHarishRajora);
        System.out.println("--The author in this article -- " + wait.until(ExpectedConditions.visibilityOf(assertAuthorHarishRajora)).getText());
        return this;
    }

    /**
     * this method check links in drop down menu  Qa practices
     */
    public MainPage goToLinksInDropDownMenuQaPractices() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonQaPractices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkIsqtbPreparation)).click();
        Assert.assertEquals("url ISTQB Foundation", ConfigProvider.URL_ISTQB_FOUNDATION, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonQaPractices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkSoftwareTesting)).click();
        Assert.assertEquals("url Software testing", ConfigProvider.URL_SOFTWARE_TESTING, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonQaPractices)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkAgileScrum)).click();
        Assert.assertEquals("url AgileScrum", ConfigProvider.URL_AGILE_SCRUM, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();
        return this;
    }

    /**
     * this method check links in drop down menu FrontEndAuto
     */

    public MainPage goToLinksInDropDownMenuFrontEndTestingAuto() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkCypress)).click();
        Assert.assertEquals("url Cypress", ConfigProvider.URL_CYPRESS, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkProtractor)).click();
        Assert.assertEquals("url Protractor", ConfigProvider.URL_PROTRACTOR, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkSeleniumInJava)).click();
        Assert.assertEquals("url SeleniumInJava", ConfigProvider.URL_SELENIUM_IN_JAVA, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkTestProject)).click();
        Assert.assertEquals("url TestProject", ConfigProvider.URL_TEST_PROJECT, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkKatalonStudio)).click();
        Assert.assertEquals("url linkKatalonStudio", ConfigProvider.URL_KATALON_STUDIO, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrontEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkSeleniumCSharp)).click();
        Assert.assertEquals("url SeleniumCSharp", ConfigProvider.URL_SELENIUM_C_SHARP, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();
        return this;

    }

    /**
     * this method check links in drop down menu BackEndTestAuto
     */

    public MainPage goToLinksInDropDownMenuBackEndTestAuto() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkRestAssured)).click();
        Assert.assertEquals("url RestAssured", ConfigProvider.URL_REST_ASSURED, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkPostman)).click();
        Assert.assertEquals("url Postman", ConfigProvider.URL_POSTMAN, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonBackEndTestingAuto)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkSoapUi)).click();
        Assert.assertEquals("url SoapUi", ConfigProvider.URL_SOAPUI, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();
        return this;
    }

    /**
     * this method check links in drop down menu MobileTestAuto
     */
    public MainPage goToLinkInDropDownMenuMobileTestAuto() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonMobileTestingAutomation)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkAppiumStudio)).click();
        Assert.assertEquals("url Appium Studio", ConfigProvider.URL_APPIUM_STUDIO, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();
        return this;
    }

    /**
     * this method check links in drop down menu Frameworks&Libraries
     */

    public MainPage goToLinkInDropDownMenuFrameworksLibraries() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrameworksAndLibraries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkCucumber)).click();
        Assert.assertEquals("url Cucumber", ConfigProvider.URL_CUCUMBER, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrameworksAndLibraries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkTestNG)).click();
        Assert.assertEquals("url TestNg", ConfigProvider.URL_TESTNG, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrameworksAndLibraries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkSpecFlow)).click();
        Assert.assertEquals("url SpecFlow", ConfigProvider.URL_SPECFLOW, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrameworksAndLibraries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkJunit)).click();
        Assert.assertEquals("url Junit", ConfigProvider.URL_JUNIT, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();

        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonFrameworksAndLibraries)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkCucumberTestNg)).click();
        Assert.assertEquals("url Extent report", ConfigProvider.URL_REPORT_FOR_CUCUMBER, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(buttonHome)).click();
        return this;
    }

    /**
     * this method check links in drop down menu Devops Tools
     */

    public MainPage goToLinkInDropDownMenuDevopsTools() {
        wait.until(ExpectedConditions.elementToBeClickable(buttonTutorials)).click();
        wait.until(ExpectedConditions.elementToBeClickable(buttonDevopsTools)).click();
        wait.until(ExpectedConditions.elementToBeClickable(linkMaven)).click();
        Assert.assertEquals("url Maven", ConfigProvider.URL_APPIUM_STUDIO, driver.getCurrentUrl());
        wait.until(ExpectedConditions.elementToBeClickable(linkMaven)).click();


        return this;
    }


}
