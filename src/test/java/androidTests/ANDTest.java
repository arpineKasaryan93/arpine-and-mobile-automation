package androidTests;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.*;
import utils.BaseTest;

public class ANDTest extends BaseTest {

    @Test
    public void clickAppButton() {
        driver.findElement(new AppiumBy.ByAccessibilityId("App")).click();
    }

}
