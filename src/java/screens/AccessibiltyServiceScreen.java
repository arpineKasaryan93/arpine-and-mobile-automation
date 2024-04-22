package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AccessibiltyServiceScreen extends BasePage {
    @AndroidFindBy(accessibility = "1. Enable TalkBack (Settings -> Accessibility -> TalkBack). \n" +
            "\n" +
            "2. Enable Explore-by-Touch (Settings -> Accessibility -> Explore by Touch). \n" +
            "\n" +
            "3. Touch explore the Clock application and the home screen. \n" +
            "\n" +
            "4. Go to the Clock application and change the time of an alarm. \n" +
            "\n" +
            "5. Enable ClockBack (Settings -> Accessibility -> ClockBack). \n" +
            "\n" +
            "6. Go to the Clock application and change an alarm. \n" +
            "\n" +
            "7. Set the ringer to vibration mode and change an alarm. \n" +
            "\n" +
            "8. Set the ringer to muted mode and change an alarm.")
    private WebElement textListItems;

    @AndroidFindBy(id = "button")
    private WebElement button;

    //get method
    public String getTextOfListItems(){
       return getText(textListItems);
    }
    //click methods

    public AccessibilityServiceDetailScreen clickButton(){
        click(button);
        return  new AccessibilityServiceDetailScreen();
    }
}
