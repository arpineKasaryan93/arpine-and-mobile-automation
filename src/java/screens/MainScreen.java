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
    @AndroidFindBy(accessibility = "Access'ibility")
    private WebElement accessibility1;
    @AndroidFindBy(accessibility = "Accessibility")
    private WebElement accessibility2;
    @AndroidFindBy(accessibility = "Animation")
    private WebElement animation;
    @AndroidFindBy(accessibility = "Content")
    private WebElement content;
    @AndroidFindBy(accessibility = "Graphics")
    private WebElement graphics;
    @AndroidFindBy(accessibility = "Media")
    private WebElement media;
    @AndroidFindBy(accessibility = "NFC")
    private WebElement nfc;
    @AndroidFindBy(accessibility = "OS")
    private WebElement os;
    @AndroidFindBy(accessibility = "Preference")
    private WebElement preference;
    @AndroidFindBy(accessibility = "Text")
    private WebElement text;
    @AndroidFindBy(accessibility = "Views")
    private WebElement views;

  @AndroidFindBy(id = "list")
   private ArrayList<WebElement>  list;

    // Click Methods
    public MainScreen clickAppButton() {
        click(appButton);
        return this;
    }
    public AccessibilityScreen1 clickAccessibility1Button() {
        click(accessibility1);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickAccessibility2Button() {
        click(accessibility2);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickAnimation() {
        click(animation);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickContent() {
        click(content);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickGraphics() {
        click(graphics);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickMedia () {
        click(media);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickNfc() {
        click(nfc);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickPreference() {
        click(preference);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickText() {
        click(text);
        return new AccessibilityScreen1();
    }
    public AccessibilityScreen1 clickViews() {
        click(views);
        return new AccessibilityScreen1();
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

    public boolean isScreenLoaded() {
        // Check if all expected elements are present
        return appButton.isDisplayed() && views.isDisplayed();
    }

}
