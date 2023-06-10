package ToolsQa.pages;


import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;


public class ToolsQaTest extends BaseSeleniumTest {
    /**
     * User searching key word "Selenium" in the searching page and read article and
     */
    @Test
    public void searchSeleniumWord() {
        MainPage mainPage = new MainPage();
        mainPage.searchArticleOnTheMainPage(ConfigProvider.SEARCH_SELENIUM);
    }

    /**
     * User go to the registration page and fill the registration form
     */
    @Test
    public void fillRegisterFormOnRegistrationPage() {
        EnrolFormPage enrolFormPage = new EnrolFormPage();
        enrolFormPage.fillTheEnrollForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.EMAIL,
                ConfigProvider.MOBILE_PHONE, ConfigProvider.CITY, ConfigProvider.COVER_LETTER);

    }

}
