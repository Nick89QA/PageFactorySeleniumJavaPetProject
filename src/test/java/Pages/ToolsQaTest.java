package Pages;

import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;


public class ToolsQaTest extends BaseSeleniumTest {

    @Test
    public void userSearchKeyWord() {
        MainPage mainPage = new MainPage();
        mainPage.searchArticleOnTheMainPage(ConfigProvider.SEARCH_SELENIUM);
        driver.navigate().back();
    }

    @Test
    public void userEnterTheRegistrtionForm() {
        EnrolFormPage enrolFormPage = new EnrolFormPage();
        enrolFormPage.fillTheEnrollForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.EMAIL,
                ConfigProvider.MOBILE_PHONE, ConfigProvider.CITY, ConfigProvider.COVER_LETTER);
    }

    @Test
    public void userCheksAllThePagesInDropDownMenu() {
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
