package screens;

import base.BasePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AccNodeQueringScreen extends BasePage {
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"io.appium.android.apis:id/tasklist_finished\").instance(0)")
    private WebElement takeOutTrashCheckMark;
    @AndroidFindBy(id = "Task Take out Trash")
    private WebElement takeOutTrash;

    public boolean isTakeOutTrashChecked(){
        return takeOutTrashCheckMark.isSelected();
    }public String getTakeOutTrashText(){
        return getText(takeOutTrash);
    }
    public void checkTheCheckmark(){
        click(takeOutTrashCheckMark);
    }
}
