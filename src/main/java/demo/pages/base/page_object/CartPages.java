package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class CartPages extends BasePageObject {

    public void clickAddToCart() {
        By element = By.id("add-to-cart-sauce-labs-backpack");
        clickOn(element);
    }

    public void clickAddToCar2() {
        By element = By.id("add-to-cart-sauce-labs-bike-light");
        clickOn(element);
    }

    public void clickIconCart() {
        By element = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
        clickOn(element);
    }

    public void clickIconRemove() {
        By element = By.id("remove-sauce-labs-backpack");
        clickOn(element);
    }

    public void clickContinueShopping() {
        By element = By.id("continue-shopping");
        clickOn(element);
    }

    public boolean isSuccessMoveToCartPage() {
        By element = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
        return isPresent(element);
    }

    public boolean isProductSuccesedAdded(String value) {
        By element = By.id("item_"+value+"_title_link");
        return isPresent(element);
    }

    public boolean isProductSuccesedRemoved() {
        By element = By.className("removed_cart_item");
        return isNotPresent(element);
    }
}

