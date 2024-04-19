package androidTests;

import org.testng.annotations.Test;
import screens.MainScreen;

class MainScreenPageTest extends BaseTest {
    @Test
    public void isClickButtonPresnt() {
        MainScreen mainScreen = new MainScreen();
        mainScreen.clickAppButton();
    }

}
