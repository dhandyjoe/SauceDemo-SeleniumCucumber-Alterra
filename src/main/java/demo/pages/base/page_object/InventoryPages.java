package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class InventoryPages extends BasePageObject {

    public void clickAddToCart(String value) {
        By element = By.id(value);
        clickOn(element);
    }

    public void clickIconCart() {
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        clickOn(element);
    }
}
