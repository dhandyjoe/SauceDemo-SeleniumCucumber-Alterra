package demo.stepdefinition;

import demo.pages.base.BasePageObject;
import demo.pages.base.page_object.TugasPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TugasStep {

    TugasPages tugasPages = new TugasPages();

    @When("User scroll to bottom page")
    public void userScrollPage() {

    }
    @And("User click facebook")
    public void userClickFacebook() {
        tugasPages.clickButtonFacebook();
    }

    @And("User move to tab")
    public void userMoveToTab() {
        tugasPages.scrollToBottomPage();
    }

    @Then("User can validate url title")
    public void isTitleFacebook() {
        System.out.println("Title = " + tugasPages.getTitleFacebook());
        Assert.assertEquals(tugasPages.getTitleFacebook(), "Sauce Labs - Home | Facebook");
    }
}
