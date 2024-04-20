package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
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

}
