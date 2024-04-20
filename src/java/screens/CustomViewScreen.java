package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomViewScreen extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Off\").instance(0)")
    private WebElement button1;

}
