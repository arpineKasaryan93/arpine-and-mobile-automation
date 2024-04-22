package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AccessibilityServiceDetailScreen extends BasePage {
    @AndroidFindBy(accessibility = "Navigate up")
    private WebElement backButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Accessibility\")")
    private WebElement topBarText;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Volume key shortcut\")")
    private WebElement volumeButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Off\").instance(0)")
    private WebElement volumeState;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"DOWNLOADED SERVICES\")")
    private WebElement downloadServices;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"ClockBack\")")
    private WebElement clockBack;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Off\").instance(1)")
    private WebElement clockBackState;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.RelativeLayout\").instance(9)")
    private WebElement darkTheme;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/widget_frame\").instance(0)")
    private WebElement darkThemeToggle;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/switch_widget\").instance(0)")
    private WebElement darkThemeToggleState;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/icon\").instance(2)")
    private WebElement magnificationIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Magnification\")")
    private WebElement magnificationButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Off\").instance(3)")
    private WebElement magnificationButtonState;

    public void toggleSwitch(){
        click(darkThemeToggle);

    } public String getToggleState(){
        return getText(darkThemeToggleState);

    }

}
