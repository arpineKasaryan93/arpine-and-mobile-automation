package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class BasePage {

    AppiumDriver driver;

    public BasePage() {
        driver = DriverManage.getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //GetText
    public String getText(WebElement element) {
        return element.getText();
    }

    // Write Text
    public void writeText(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Click Method
    public void click(WebElement element) {
        element.click();
    }

    public void clickByIndex(List<WebElement> element, int index) {
        element.get(index).click();
    }

    public void waitForElementToBeVisible(WebElement element, Duration timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void swipe(AppiumDriver driver, int startX, int startY, int endX, int endY, int duration) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(new PointerInput(PointerInput.Kind.TOUCH, "finger").createPointerMove(Duration.ofMillis(duration), PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(List.of(swipe));
    }

    public static void swipeUp() {
        Dimension screenSize = Utils.getScreenSize(DriverManage.getDriver());
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();
        swipe(DriverManage.getDriver(), screenWidth / 2, screenHeight / 4, screenWidth / 2, screenHeight * 3 / 4, 1000);
    }

    public static void swipeDown() {
        Dimension screenSize = Utils.getScreenSize(DriverManage.getDriver());
        int screenWidth = screenSize.getWidth();
        int screenHeight = screenSize.getHeight();
        swipe(DriverManage.getDriver(), screenWidth / 2, screenHeight * 3 / 4, screenWidth / 2, screenHeight / 4, 1000);
    }

    public static void swipeUpUntilElementAppears(WebElement element) {
        int count = 5;
        while (!element.isDisplayed() && count != 0) {
            swipeUp();
            count--;
        }
    }

    public void swipeDownUntilElementAppears(WebElement element) {
        int count = 5;
        while (!element.isDisplayed() && count != 0) {
            swipeDown();
            count--;
        }
    }
}

