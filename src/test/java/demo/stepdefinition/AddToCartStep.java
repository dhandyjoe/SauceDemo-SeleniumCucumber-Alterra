package demo.stepdefinition;

import demo.pages.base.page_object.CartPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCartStep {

    CartPages cartPages = new CartPages();

    @When("User click add to cart in a product")
    public void userClickAddToCart() {
        cartPages.clickAddToCart();
    }

    @And("User click Cart icon")
    public void userClickIconCart() {
        cartPages.clickIconCart();
    }

    @And("The page will be move to Cart page")
    public void isSuccessMoveToCartPage() {
        cartPages.isSuccessMoveToCartPage();
    }

    @And("User can see the {string} added in the cart")
    public void isSuccessAddToCart(String value) {
        Assert.assertTrue(cartPages.isProductSuccesedAdded(value));
    }

}