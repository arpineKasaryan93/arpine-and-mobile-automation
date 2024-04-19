package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


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

    public void clickByIndex(WebElement element, int index) {
        element.click();
    }
}
