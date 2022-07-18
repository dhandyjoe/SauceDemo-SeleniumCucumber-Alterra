package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class TugasPages extends BasePageObject {

    public void scrollToBottomPage() {
        scrollDown();
    }

    public void clickButtonFacebook() {
        By element = By.xpath("//*[@id=\"page_wrapper\"]/footer/ul/li[2]/a");
        clickOn(element);
    }

    public void moveToTab() {
        moveToTab(1);
    }

    public String getTitleFacebook() {
        return getTitle();
    }

}
