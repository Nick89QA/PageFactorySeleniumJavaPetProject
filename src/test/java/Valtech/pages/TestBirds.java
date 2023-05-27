package Valtech.pages;

import core.BaseSeleniumTest;
import org.junit.Test;

public class TestBirds extends BaseSeleniumTest {

    @Test
    public void checkHref() {
    MainPage mainPage = new MainPage();
    mainPage.visitToWebSite();
    }
}
