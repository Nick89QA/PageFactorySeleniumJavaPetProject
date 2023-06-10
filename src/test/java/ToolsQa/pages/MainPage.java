package ToolsQa.pages;

import core.BaseSeleniumPage;
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


    public MainPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);
    }


    public MainPage searchArticleOnTheMainPage(String searchValue) {
        wait.until(ExpectedConditions.visibilityOf(inputSearch)).sendKeys(Keys.ENTER, searchValue);
        wait.until(ExpectedConditions.visibilityOf(articleHowToHandle)).click();
        js.executeScript("arguments[0].scrollIntoView(true);", assertAuthorHarishRajora);
        System.out.println("--Text in this -- " + wait.until(ExpectedConditions.visibilityOf(assertAuthorHarishRajora)).getText());
        return this;
    }

}
