package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class CartPages extends BasePageObject {

    public boolean isSuccessMoveToCartPage() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        return isPresent(element);
    }

    public void clickContinueShopping() {
        By element = By.id("continue-shopping");
        clickOn(element);
    }

    public void clickIconRemove(String value) {
        By element = By.id(value);
        clickOn(element);
    }

    public boolean isProductSuccesedAdded(String value) {
//        By element = By.className("cart_item");
        return isMatchedProductCart(value);
    }

    public boolean isProductSuccesedRemoved() {
        By element = By.className("removed_cart_item");
        return isPresent(element);
    }
}

