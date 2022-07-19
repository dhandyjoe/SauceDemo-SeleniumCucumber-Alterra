package demo.stepdefinition;

import demo.pages.base.page_object.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {

    LoginPages loginPages = new LoginPages();

    @When("User input {string} and {string}")
    public void inputUsernameAndPassword(String username, String password) {
        loginPages.inputUsername(username);
        loginPages.inputPassword(password);
    }

    @And("User click button login")
    public void clickButtonLogin() {
        loginPages.clickButtonLogin();
    }

    @Then("Success move to Inventory page")
    public void isSuccessLogin() {
        Assert.assertTrue(loginPages.isSuccessLogin());
    }
}
