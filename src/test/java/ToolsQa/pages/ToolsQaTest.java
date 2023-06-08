package ToolsQa.pages;


import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;


public class ToolsQaTest extends BaseSeleniumTest {
    /**
     * Main Page
     */
    @Test
    public void checkDropDownMenuSolutions() {
        MainPage mainPage = new MainPage();
        mainPage.checkDropDownMenu();
    }

    /**
     * Contact Us page
     */
    @Test
    public void fillTheEnrollForm()  {
        EnrolFormPage enrolFormPage = new EnrolFormPage();
        enrolFormPage.fillTheEnrollForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.EMAIL,
                ConfigProvider.MOBILE_PHONE,ConfigProvider.CITY, ConfigProvider.COVER_LETTER);

    }
    @Test
    public void checkCookie() {
        EnrolFormPage contactUsPage = new EnrolFormPage();


    }


}
