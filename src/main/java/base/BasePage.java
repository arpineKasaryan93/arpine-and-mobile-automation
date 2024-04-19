package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage  {

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
