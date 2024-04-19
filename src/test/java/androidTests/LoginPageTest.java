package androidTests;

import org.testng.annotations.Test;
import screens.LoginScreen;
import utils.BaseTest;

public class LoginPageTest extends BaseTest {
    @Test
    public void testLogin() {
        LoginScreen loginPage = new LoginScreen();
        loginPage.enterUsername("your_username");
        loginPage.enterPassword("your_password");
        loginPage.clickLogin();
    }
}