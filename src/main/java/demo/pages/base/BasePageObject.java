package demo.pages.base;

import demo.webdriver.WebdriverInstance;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BasePageObject {

    public WebDriver getDriver() {
        return WebdriverInstance.webdriver;
    }
    public Select getSelect() {
        return new Select(getDriver().findElement(By.className("product_sort_container")));
    }

    public void clickOn(By element) {
        getDriver().findElement(element).click();
    }

    public void typeOn(By element, String text) {
        getDriver().findElement(element).sendKeys(text);
    }

    public boolean isPresent(By element) {
        return getDriver().findElement(element).isDisplayed();
    }

    public boolean isMatchedProductCart(String value) {
        boolean statusElement = false;
        List<WebElement> elements = getDriver().findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(value)) {
                statusElement = true;
                break;
            }
        }
        return statusElement;
    }

    public void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scroll(0, 350)");
    }

    public void moveToTab(int index) {
        ArrayList<String> tabs = new ArrayList(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(index));
        System.out.println(tabs);
    }

    public String getTitle() {
        return getDriver().getTitle();
    }

//    public void select(String element) {
//        getSelect(element);
//    }

    public void selectByValue(String value) {
        getSelect().selectByValue(value);
    }
}
