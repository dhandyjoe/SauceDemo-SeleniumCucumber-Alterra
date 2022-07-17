package demo.pages.base.page_object;

import demo.pages.base.BasePageObject;
import org.openqa.selenium.By;

public class CheckoutPages extends BasePageObject {

    public void clickShoppingCart() {
        By element = By.id("shopping_cart_container");
        clickOn(element);
    }

    public void clickCheckoutButton() {
        By element = By.id("checkout");
        clickOn(element);
    }

    public void inputFirstName(String firstName) {
        By element = By.id("first-name");
        typeOn(element, firstName);
    }

    public void inputLastName(String firstName) {
        By element = By.id("first-name");
        typeOn(element, firstName);
    }



}
