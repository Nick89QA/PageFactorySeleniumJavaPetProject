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

    String URL_MAIN_PAGE = readConfig().getString("urlMainPage");
    String FIRST_NAME = readConfig().getString("userParams.testUser.firstName");
    String LAST_NAME = readConfig().getString("userParams.testUser.lastName");
    String COMPANY = readConfig().getString("userParams.testUser.company");
    String COVER_LETTER = readConfig().getString("userParams.testUser.coverLetter");
    String URL_CONTACT_US = readConfig().getString("urlContactUs");


}

