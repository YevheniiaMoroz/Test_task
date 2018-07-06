import com.codeborne.selenide.Configuration;
import org.junit.After;
import org.junit.Before;
import utils.DriverPreparation;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseTest {
    /**
     * BaseTest.class used for running general actions:
     * 1. Open selected browser
     * 2. Open testing site
     */

    public static final String CSLTD_URL = "https://csltd.com.ua/";

    @After
    public void tearDown() throws Exception {
        getWebDriver().quit();
    }

    @Before
    public void openHomePage() {
        DriverPreparation.prepareBrowser("CHROME");
        Configuration.browser = "CHROME";
        open(CSLTD_URL);
    }
}
