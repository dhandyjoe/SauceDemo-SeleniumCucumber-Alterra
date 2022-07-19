package demo.stepdefinition;

import demo.pages.base.page_object.FacebookPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FacebookStep {

    FacebookPages tugasPages = new FacebookPages();

    @When("User scroll to bottom page")
    public void userScrollPage() {
        tugasPages.scrollToBottomPage();
    }

    @And("User click facebook")
    public void userClickFacebook() {
        tugasPages.clickButtonFacebook();
    }

    @And("User move to tab")
    public void userMoveToTab() {
        tugasPages.moveToTab(1);
    }

    @Then("User can validate url title")
    public void isTitleFacebook() {
        Assert.assertEquals(tugasPages.getTitleFacebook(), "Sauce Labs - Home | Facebook");
    }
}
