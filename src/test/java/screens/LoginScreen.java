package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.BaseTest;

public class LoginScreen extends BaseTest {
    // Page Factory elements
    @AndroidFindBy(id = "username")
    private WebElement usernameField;

    @AndroidFindBy(id = "password")
    private WebElement passwordField;

    @AndroidFindBy(id = "loginBtn")
    private WebElement loginButton;

    public LoginScreen() {
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}

