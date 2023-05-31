package TestBirds.pages;

import core.BaseSeleniumTest;
import org.junit.Test;


public class TestBirds extends BaseSeleniumTest {

    @Test
    public void checkDropDownMenuSolutions() {
        MainPage mainPage = new MainPage();
        mainPage.checkDropDownMenu();
    }


}
