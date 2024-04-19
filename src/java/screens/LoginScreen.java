package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
public class LoginScreen extends BasePage {
    // Page Factory elements
    @AndroidFindBy(id = "username")
    private WebElement usernameField;

    @AndroidFindBy(id = "password")
    private WebElement passwordField;

    @AndroidFindBy(id = "loginBtn")
    private WebElement loginButton;

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

