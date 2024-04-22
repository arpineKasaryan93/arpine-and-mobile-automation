package base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Dimension;

public class Utils {

    public static Dimension getScreenSize(AppiumDriver driver) {
        return driver.manage().window().getSize();
    }
}