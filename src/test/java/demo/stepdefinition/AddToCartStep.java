package demo.stepdefinition;

import demo.pages.base.page_object.AddToCartPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCartStep {

    AddToCartPages addToCartPages = new AddToCartPages();

    @When("User click add to cart in a product")
    public void userClickAddToCart() {
        addToCartPages.clickAddToCart();
    }

    @And("User click Cart icon")
    public void userClickIconCart() {
        addToCartPages.clickAddToCart();
    }

    @And("And the page will be move to Cart page")
    public void isSuccessMoveToCartPage() {
        addToCartPages.clickAddToCart();
    }

    @Then("User can see the product added in the cart")
    public void isSuccessAddToCart() {
        Assert.assertTrue(addToCartPages.isSuccessAddToCart());
    }
}