package ToolsQa.pages;

import core.BaseSeleniumTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import readProperties.ConfigProvider;


public class ToolsQaTest extends BaseSeleniumTest {

    @Given("User go to the main page and enter Selenium in a search page")
    public void user_go_to_the_main_page_and_enter_selenium_in_a_search_page() {
        MainPage mainPage = new MainPage();
        mainPage.searchArticleOnTheMainPage(ConfigProvider.SEARCH_SELENIUM);
        driver.navigate().back();
    }

    @When("User go to registration page and enter the data in the registration form")
    public void user_go_to_registration_page_and_enter_the_data_in_the_registration_form() {
        EnrolFormPage enrolFormPage = new EnrolFormPage();
        enrolFormPage.fillTheEnrollForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.EMAIL,
                ConfigProvider.MOBILE_PHONE, ConfigProvider.CITY, ConfigProvider.COVER_LETTER);
    }

    @Then("User checks all the pages in drop down menu")
    public void user_checks_all_the_pages_in_drop_down_menu() {
        MainPage mainPage = new MainPage();
        mainPage.checkLinksInDropDownMenuQaPractices();
        mainPage.checkLinksInDropDownMenuFrontEndTestingAuto();
        mainPage.checkLinksInDropDownMenuBackEndTestAuto();
        mainPage.checkLinkInDropDownMenuMobileTestAuto();
        mainPage.checkLinkInDropDownMenuFrameworksLibraries();
        mainPage.checkLinkInDropDownMenuDevopsTools();
        mainPage.checkLinkInDropDownMenuCrossBrowserTesting();
        mainPage.checkLinkInDropDownMenuNonFunctionalTesting();
        mainPage.checkLinksInDropDownMenuProgrammingLanguage();


    }

}
