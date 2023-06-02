package TestBirds.pages;

import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;


public class TestBirds extends BaseSeleniumTest {

    @Test
    public void checkDropDownMenuSolutions() {
        MainPage mainPage = new MainPage();
        mainPage.checkDropDownMenu();
    }

    @Test
    public void fillContactUsForm()  {
     ContactUsPage contactUsPage = new ContactUsPage();
     contactUsPage.fillTheForm(ConfigProvider.FIRST_NAME);
    }

    @Test
    public void switchWindows () throws InterruptedException{
        String mainHandle = driver.getWindowHandle();
        System.out.println("Window handle " + mainHandle);
    }


}
