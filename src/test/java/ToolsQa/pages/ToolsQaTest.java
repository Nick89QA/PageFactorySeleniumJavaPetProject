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
        enrolFormPage.fillTheEnrollForm();

    }
    @Test
    public void checkCookie() {
        EnrolFormPage contactUsPage = new EnrolFormPage();


    }


}
