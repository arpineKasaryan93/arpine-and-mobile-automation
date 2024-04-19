package screens;


import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MainScreen extends BasePage {
    // Page Factory elements

    @AndroidFindBy(accessibility = "App")
    private WebElement appButton;
    @AndroidFindBy(accessibility = "App")
    private ArrayList<WebElement> examples;

    // Click Methods
    public MainScreen clickAppButton() {
        click(appButton);
        return this;
    }

    //Boolean Methods
    public boolean isAppButtonAppear() {
        try {
            return appButton.isDisplayed();
        } catch (NoSuchElementException | StaleElementReferenceException e) {
            return false;
        }

    }
    // Get methods
    public String getAppText() {
        return getText(appButton);
    }

    //Write methods
    public void write(String text) {
        writeText(appButton, text);
    }

}
