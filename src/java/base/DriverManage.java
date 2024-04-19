package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
public class DriverManage {
    protected static AppiumDriver driver;

    //
//    private base.DriverManage() {
//
//    }
//
    public void setDriver(AppiumDriverLocalService service) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platfromVersion", "10.0");
        capabilities.setCapability("deviceName", "AndroidEmulator");
        capabilities.setCapability("app", "/Users/arpinekasaryan/dev/arpine-and-mobile-automation/src/test/resources/apps/ApiDemosDebug.apk");
        driver = new AndroidDriver(service.getUrl(), capabilities);
    }

    public static AppiumDriver getDriver() {
        return driver;
    }


}
//
//
