package androidTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.AccessibilityScreen1;
import screens.MainScreen;

class MainScreenPageTest extends BaseTest {
    @Test
    public void isClickButtonPreswnt() {
        MainScreen mainScreen = new MainScreen();
       AccessibilityScreen1 accessibilityScreen1= mainScreen.clickAccessibility1Button();
       accessibilityScreen1.clickCustomView();
        Assert.assertEquals(accessibilityScreen1.getActionBarText(),"API Demos");

    }

}
