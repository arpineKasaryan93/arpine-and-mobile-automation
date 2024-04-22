package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomViewScreen extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Off\").instance(0)")
    private WebElement button1;
    @AndroidFindBy(accessibility = "1. Enable TalkBack (Settings -> Accessibility -> TalkBack). \n" +
            "\n" +
            "2. Enable Explore-by-Touch (Settings -> Accessibility -> Explore by Touch). \n" +
            "\n" +
            "3. Touch explore/poke the buttons.")
    private WebElement textOfTheCustomView;

    public String buttonText(){
        return getText(button1);
    }

    public String getTextOfCustomView() {
        return getText(textOfTheCustomView);
    }

}
