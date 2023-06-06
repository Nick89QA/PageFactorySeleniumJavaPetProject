package ToolsQa.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

public class MainPage extends BaseSeleniumPage {


    @FindBy(xpath = "//div/a[contains(@href, 'selenium-training?q=banner#enroll-form')]")
    private WebElement buttonEnrollYourself;

    @FindBy(xpath = "//div/a[contains(@class, 'new-training__read-more')]")
    private WebElement buttonReadMore;

    @FindBy(xpath = "//div/a[contains(@href, '/articles')]")
    private WebElement buttonLatestArticles;


    private WebElement buttonDemoSite;
    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Demo Site']")

    private WebElement buttonAbout;
    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'About']")

    private WebElement buttonSeleniumTraining;
    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Selenium Training']")

    private WebElement buttonHome;
    @FindBy(xpath = "//div[@class='col-auto']//*[text() = 'Home']")


    public MainPage() {
        driver.get(ConfigProvider.URL_MAIN_PAGE);
        PageFactory.initElements(driver, this);
    }

    public MainPage checkDropDownMenu() {
        solutionsList.click();
        qualityAssuranceList.click();
        buttonLatestArticles.click();
        return this;
    }

}
