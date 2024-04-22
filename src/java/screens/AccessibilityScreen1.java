package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccessibilityScreen1 extends BasePage {
    @AndroidFindBy(accessibility = "Accessibility Node Provider")
    private WebElement accessibilityNodeProvider;
    @AndroidFindBy(accessibility = "Accessibility Node Querying")
    private WebElement accessibilityNodeQuerying;
    @AndroidFindBy(accessibility = "Accessibility Service")
    private WebElement accessibilityService;
    @AndroidFindBy(accessibility = "Custom View")
    private WebElement customView;
    @AndroidFindBy(id = "list")
    private List<WebElement> list;
    @AndroidFindBy( uiAutomator= "new UiSelector().text(\"API Demos\")")
    private WebElement actionBar;

    //click Methods

    public CustomViewScreen clickCustomView() {
        click(customView);
        return new CustomViewScreen();

    } public AccessibiltyServiceScreen  clickService() {
        click(accessibilityService);
        return new AccessibiltyServiceScreen();

    }

    public String getActionBarText() {
        return getText(actionBar);
    }

}
