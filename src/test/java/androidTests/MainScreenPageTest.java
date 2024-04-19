package androidTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;
import utils.BaseTest;

public class MainScreenPageTest extends BaseTest {
    @Test
    public void isClickButtonPresnt() {
        MainScreen mainScreen = new MainScreen();
        Assert.assertTrue(mainScreen.isAppButtonAppear(), "app is not present");
    }

}
