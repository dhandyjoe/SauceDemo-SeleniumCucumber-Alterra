package demo.stepdefinition;

import demo.pages.base.page_object.CheckoutPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CheckoutStep {

    CheckoutPages checkoutPages = new CheckoutPages();

    @And("User click shopping cart")
    public void clickButtonLogin() {
        checkoutPages.clickShoppingCart();
    }

    @And("User click checkout button")
    public void clickButtonCheckout() {
        checkoutPages.clickCheckoutButton();
    }

    @And("User input {string} and {string} and {string}")
    public void inputFirstName() {

    }

    @And("User click continue button")
    public void clickContinueButton() {

    }

    @Then("User can see checkout overview")
    public void isCheckoutOverview() {
//        Assert.assertTrue();
    }

    @And("User click finish button")
    public void clickFinishButton() {

    }

//    @Then("User can see success checkout")
//    public void
}

