package readProperties;

import org.junit.Test;

public class TestReadConfig {
    @Test
    public void readConfig() {
        String coverLetter = ConfigProvider.COVER_LETTER;
        System.out.println(coverLetter);
        String firstName = ConfigProvider.FIRST_NAME;
        System.out.println(firstName);
        String lastName = ConfigProvider.LAST_NAME;
        System.out.println(lastName);
        String company = ConfigProvider.COMPANY;
        System.out.println(company);
    }
}
