package demo.stepdefinition;

import demo.pages.base.page_object.SearchPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SearchStep {
    SearchPages searchPages = new SearchPages();

    @And("User choose filter {string}")
    public void userChooseFilter(String value) {
        searchPages.chooseFilter(value);
    }

    @Then("{string} in the first list products")
    public void isPresent(String value) {
        Assert.assertEquals(searchPages.isPresentProductInTheFirstList(value), value);
    }
}
