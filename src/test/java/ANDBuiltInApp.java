import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ANDBuiltInApp {
    static AppiumDriverLocalService service;
    AppiumDriver driver;

    @BeforeTest
    public static void appiumServerStart() {
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1")
                .usingPort(4723)
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "debug");

        service = AppiumDriverLocalService.buildService(builder);
        service.start();
        service.isRunning();
    }

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platfromVersion", "10.0");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), capabilities);

        service.isRunning();
    }

    @Test
    public void click() {
        driver.findElement(By.id("digit_1")).click();
        driver.findElement(By.id("op_add")).click();
        driver.findElement(By.id("digit_3")).click();
        driver.findElement(By.id("eq")).click();
        Assert.assertEquals(driver.findElement(By.id("result")).getText(),4);
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
