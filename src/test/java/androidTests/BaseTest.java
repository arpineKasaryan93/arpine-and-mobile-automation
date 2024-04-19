package androidTests;


import base.DriverManage;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class BaseTest {
    DriverManage appiumDriver = new DriverManage();
    static AppiumDriverLocalService service;

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
        appiumDriver.setDriver(service);
    }


    @AfterMethod
    public void tearDown() {

        if (DriverManage.getDriver() != null) {
            DriverManage.getDriver().quit();

        }
    }

    @AfterSuite
    public void stopAppiumServer() {
        service.stop();
    }
}

