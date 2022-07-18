package demo.stepdefinition;

import demo.pages.base.page_object.CartPages;
import demo.pages.base.page_object.InventoryPages;
import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import io.cucumber.java.sl.In;
import org.junit.Assert;

public class ContinueShopping {

    CartPages cartPages = new CartPages();
    LoginPages loginPages = new LoginPages();
    InventoryPages inventoryPages = new InventoryPages();

    @When("User click continue shopping button")
    public void userClickContinueShoppingButton() {
        cartPages.clickContinueShopping();
    }

    @And("The page will be move to Home page")
    public void isSuccessLogin() {
        Assert.assertTrue(loginPages.isSuccessLogin());
    }}
