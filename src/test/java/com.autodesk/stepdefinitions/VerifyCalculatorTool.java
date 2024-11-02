package com.autodesk.stepdefinitions;

import com.autodesk.pages.HomePage;
import com.autodesk.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyCalculatorTool {

    HomePage homePage= new HomePage();

    @Given("user is navigated successfully to Google home page")
    public void user_is_navigated_successfully_to_google_home_page() {
        Driver.getDriver().get("https://www.google.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @And("user clicks on Stay Signed Out button")
    public void user_clicks_on_Stay_Signed_Out_button(){
        homePage.clickStaySignedOutButton();
    }
    @And("user clicks on Seach Bar")
    public void user_clicks_on_seach_bar() {
       homePage.clickOnSearchBar();
    }
    @When("user types the term {string}")
    public void user_types_the_term(String string) {
        homePage.addTextToTextBarInHomePage();
    }

    @And("user clicks on enter button on keyboard")
    public void user_clicks_on_enter_button() {
        homePage.clickEnterOnKeyboard();
    }


    @Then("user is able to see the calculator details")
    public void user_is_able_to_see_the_product_details(io.cucumber.datatable.DataTable dataTable) {
        Assert.assertTrue(homePage.isNumberZeroDisplayed());
        Assert.assertTrue(homePage.isNumberOneDisplayed());
        Assert.assertTrue(homePage.isNumberTwoDisplayed());
        Assert.assertTrue(homePage.isNumberThreeDisplayed());
        Assert.assertTrue(homePage.isNumberFourDisplayed());
        Assert.assertTrue(homePage.isNumberFiveDisplayed());
        Assert.assertTrue(homePage.isNumberSixDisplayed());
        Assert.assertTrue(homePage.isNumberSevenDisplayed());
        Assert.assertTrue(homePage.isNumberEightDisplayed());
        Assert.assertTrue(homePage.isNumberNineDisplayed());
        Assert.assertTrue(homePage.isPlusDisplayed());
        Assert.assertTrue(homePage.isMinusDisplayed());
        Assert.assertTrue(homePage.isMultiplyDisplayed());
        Assert.assertTrue(homePage.isDivideDisplayed());
        Assert.assertTrue(homePage.isAllClearDisplayed());
    }

}
