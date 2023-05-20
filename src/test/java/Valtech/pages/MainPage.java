package Valtech.pages;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public class MainPage extends BaseSeleniumPage {


    @FindBy(xpath = "//*[@id='menu-item-53']")
    private WebElement solutionsList;

    @FindBy(xpath = "//*[@href='/en/services/quality-assurance/'][@class='dropdown-item']")
    private WebElement qualityAssuranceList;

    @FindBy(xpath = "//*[@href='#the-solution']")
    private WebElement theSolutionButton;

    public MainPage() {
        driver.get();
        PageFactory.initElements(driver,this);
    }

    public MainPage visitToWebSite() {
        solutionsList.click();
        qualityAssuranceList.click();
        theSolutionButton.click();
        return this;
    }
}
