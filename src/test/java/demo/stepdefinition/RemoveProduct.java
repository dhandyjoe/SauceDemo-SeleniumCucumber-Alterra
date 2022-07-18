package demo.stepdefinition;

import demo.pages.base.page_object.CartPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RemoveProduct {

    CartPages cartPages = new CartPages();

    @When("User click Remove Button from {string}")
    public void userClickRemoveButton(String value) {
        cartPages.clickIconRemove(value);
    }

    @Then("Product is removed")
    public void isProductIsRemoved() {
        Assert.assertFalse(cartPages.isProductSuccesedRemoved());
    }
}
