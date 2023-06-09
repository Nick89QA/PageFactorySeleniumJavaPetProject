package ToolsQa.pages;


import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;


public class ToolsQaTest extends BaseSeleniumTest {
    /**
     * Searching Page
     */
    @Test
    public void searchSomeWord() {
        MainPage mainPage = new MainPage();
        mainPage.searchArticle(ConfigProvider.SEARCH_KEY_WORD);

    }


    /**
     * Registration page
     */
    @Test
    public void fillRegisterFormOnRegistrationPage() {
        EnrolFormPage enrolFormPage = new EnrolFormPage();
        enrolFormPage.fillTheEnrollForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.EMAIL,
                ConfigProvider.MOBILE_PHONE, ConfigProvider.CITY, ConfigProvider.COVER_LETTER);

    }


    @Test
    public void checkCookie() {
        EnrolFormPage enrolFormPage = new EnrolFormPage();

    }

}
