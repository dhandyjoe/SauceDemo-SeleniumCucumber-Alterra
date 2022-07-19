package demo.stepdefinition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.CartPages;
import demo.pages.base.page_object.InventoryPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCartStep {

    CartPages cartPages = new CartPages();
    InventoryPages inventoryPages = new InventoryPages();

    @When("User click add to cart in a {string}")
    public void userClickAddToCart(String value) {
        inventoryPages.clickAddToCart(value);
    }

    @And("User click Cart icon")
    public void userClickIconCart() {
        inventoryPages.clickIconCart();
    }

    @And("The page will be move to Cart page")
    public void isSuccessMoveToCartPage() throws InterruptedException {
        cartPages.isSuccessMoveToCartPage();
    }

    @And("User can see the {string} added in the cart")
    public void isSuccessAddToCart(String value) {
        Assert.assertEquals(cartPages.getTextNameProductCart(value), value);
    }
}