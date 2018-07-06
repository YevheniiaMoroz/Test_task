package utils;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class DriverPreparation {
    /**
     * DriverPreparation.class used for driver preparation for Chrome or Firefox
     */

    private DriverPreparation() {

    }

    public static void prepareBrowser(String name) {
        switch (name) {
            case "FIREFOX":
                FirefoxDriverManager.getInstance().setup();
                break;
            case "CHROME":
                ChromeDriverManager.getInstance().setup();
                break;
        }
    }
}
