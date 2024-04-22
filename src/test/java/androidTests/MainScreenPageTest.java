package androidTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AccessibilityScreen1;
import screens.CustomViewScreen;
import screens.MainScreen;

public class MainScreenPageTest extends BaseTest {
    @Test
    public void checkAccisibiltyFlow() {
        MainScreen mainScreen = new MainScreen();
        AccessibilityScreen1 accessibilityScreen1 = mainScreen.clickAccessibility1Button();
        Assert.assertEquals(accessibilityScreen1.getActionBarText(), "API Demos");
        CustomViewScreen customViewScreen = accessibilityScreen1.clickCustomView();
        customViewScreen.getTextOfCustomView();
        Assert.assertEquals(customViewScreen.buttonText(), "Off");

    }

    @Test
    public void toggleSwitchCheck() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.clickAccessibility1Button().clickService().clickButton().toggleSwitch();
    }

}
