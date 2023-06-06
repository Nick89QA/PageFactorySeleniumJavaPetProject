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
    public void fillContactUsForm()  {
        ContactUsPage contactUsPage = new ContactUsPage();
        contactUsPage.fillTheForm(ConfigProvider.FIRST_NAME,
                ConfigProvider.LAST_NAME, ConfigProvider.COMPANY,
                ConfigProvider.EMAIL, ConfigProvider.MOBILE_PHONE, ConfigProvider.COVER_LETTER);

    }
    @Test
    public void checkCookie() {
        ContactUsPage contactUsPage = new ContactUsPage();


    }


}
