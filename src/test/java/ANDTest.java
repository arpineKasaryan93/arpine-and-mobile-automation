import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class ANDTest {
    static AppiumDriverLocalService service;
    AppiumDriver driver;

    @BeforeTest
    public static void appiumServerStart() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder ();
        builder.withIPAddress ("127.0.0.1")
                .usingPort (4723)
                .withArgument (GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument (GeneralServerFlag.LOG_LEVEL, "debug");

        service = AppiumDriverLocalService.buildService (builder);
        service.start ();
        service.isRunning();
    }

    public static void stoptServer() {

        service.stop();

    }

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platfromVersion", "10.0");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("app", "/Users/arpinekasaryan/dev/ANDMobileAutomationProject/apps/ApiDemosDebug.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);

        service.isRunning();
    }

    @Test
    public void clickAppButton() {
        driver.findElement(new AppiumBy.ByAccessibilityId("App")).click();
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @AfterClass
    public void stopServer() {
        service.stop();
    }

}
