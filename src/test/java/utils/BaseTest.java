package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class BaseTest {
    static AppiumDriverLocalService service;

    static protected AppiumDriver driver;

    @BeforeSuite
    public static void appiumServerStart() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1")
                .usingAnyFreePort()
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "debug");

        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        System.out.println(service.isRunning());
        System.out.println(service.getUrl());
    }


    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platfromVersion", "10.0");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("app", "/Users/arpinekasaryan/dev/arpine-and-mobile-automation/src/test/resources/apps/ApiDemosDebug.apk");
        driver = new AndroidDriver(service.getUrl(), capabilities);

        System.out.println(service.isRunning());
    }


    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            service.stop();
        }
    }
}

