package Valtech.pages;

import core.BaseSeleniumTest;
import org.junit.Test;

public class ValtechTest extends BaseSeleniumTest {
    private final static String BASE_URL = "https://www.testbirds.com/en/";

    @Test
    public void checkHref() {
    MainPage mainPage = new MainPage();
    mainPage.visitToWebSite();
    }
}
