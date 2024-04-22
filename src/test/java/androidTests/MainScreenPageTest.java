package androidTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.*;

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
        AccessibilityServiceDetailScreen accessibilityServiceDetailScreen = new AccessibilityServiceDetailScreen();
        Assert.assertTrue(mainScreen.isScreenLoaded(), "Screen is not loaded");
        mainScreen.clickAccessibility1Button().clickService().clickButton().toggleSwitch();
    }
    @Test
    public void unCheckMark() {
        MainScreen mainScreen = new MainScreen();
        AccNodeQueringScreen accNodeQueringScreen = new AccNodeQueringScreen();
        mainScreen.clickAccessibility1Button().clickNodeQuery().checkTheCheckmark();
        Assert.assertFalse(accNodeQueringScreen.isTakeOutTrashChecked(),"Check mark is nor removed");
    }

}
