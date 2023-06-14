package readProperties;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();


    static Config readConfig() {
        return ConfigFactory.systemProperties().hasPath("testProfile")
                ? ConfigFactory.load(ConfigFactory.systemProperties().getString(""))
                : ConfigFactory.load("application.conf");
    }

    /**
     * enroll form page
     */
    String URL_MAIN_PAGE = readConfig().getString("urlToolsQa");
    String FIRST_NAME = readConfig().getString("userParams.testUser.firstName");
    String LAST_NAME = readConfig().getString("userParams.testUser.lastName");
    String CITY = readConfig().getString("userParams.testUser.company");
    String EMAIL = readConfig().getString("userParams.testUser.email");
    String MOBILE_PHONE = readConfig().getString("userParams.testUser.phone");
    String COVER_LETTER = readConfig().getString("userParams.testUser.coverLetter");
    String URL_DEMO_PAGE = readConfig().getString("urlDemoPage");

    /**
     * searching key word
     */
    String SEARCH_SELENIUM = readConfig().getString("searchKeyWord");

    /**
     * links from drop down menu "Tutorials" on the main page
     */
    String URL_ISTQB_FOUNDATION = readConfig().getString("links.urlIstqbPreparation");
    String URL_SOFTWARE_TESTING = readConfig().getString("links.urlSoftwareTesting");
    String URL_AGILE_SCRUM = readConfig().getString("links.urlAgileScrum");
    String URL_CYPRESS = readConfig().getString("links.urlCypress");
    String URL_PROTRACTOR = readConfig().getString("links.urlProtractor");
    String URL_SELENIUM_IN_JAVA = readConfig().getString("links.urlSeleniumInJava");
    String URL_TEST_PROJECT = readConfig().getString("links.urlTestProject");
    String URL_KATALON_STUDIO = readConfig().getString("links.urlKatalonStudio");
    String URL_SELENIUM_C_SHARP = readConfig().getString("links.urlSeleniumCSharp");


}

