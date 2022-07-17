package demo.stepdefinition;

import demo.pages.base.page_object.CartPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RemoveProduct {

    CartPages cartPages = new CartPages();

    @When("User click Remove Button")
    public void userClickRemoveButton() {
        cartPages.clickIconRemove();
    }

    @Then("Product is removed")
    public void isProductIsRemoved() {
        Assert.assertTrue(cartPages.isProductSuccesedRemoved());
    }
}
