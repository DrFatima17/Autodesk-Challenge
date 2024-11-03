package com.autodesk.stepdefinitions;

import com.autodesk.pages.HomePage;
import com.autodesk.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static org.yaml.snakeyaml.tokens.Token.ID.Value;

public class VerifyCalculatorTool {

    HomePage homePage= new HomePage();


    @Given("user is navigated successfully to Google home page")
    public void user_is_navigated_successfully_to_google_home_page() {
        Driver.getDriver().get("https://www.google.com/search?client=firefox-b-d&q=calculator");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);}
    }

//    @And("user clicks on Stay Signed Out button")
//    public void user_clicks_on_Stay_Signed_Out_button(){
//        homePage.clickStaySignedOutButton();
//    }
//    @And("user clicks on Seach Bar")
//    public void user_clicks_on_seach_bar() {
//       homePage.clickOnSearchBar();
//    }
//    @When("user types the term {string}")
//    public void user_types_the_term(String string) {
//        homePage.addTextToTextBarInHomePage();
//    }
//
//    @And("user clicks on enter button on keyboard")
//    public void user_clicks_on_enter_button() {
//        homePage.clickEnterOnKeyboard();
//    }
//
//
//    @Then("user is able to see the calculator details")
//    public void user_is_able_to_see_the_product_details() {
//        Assert.assertTrue(homePage.isNumberZeroDisplayed());
//        Assert.assertTrue(homePage.isNumberOneDisplayed());
//        Assert.assertTrue(homePage.isNumberTwoDisplayed());
//        Assert.assertTrue(homePage.isNumberThreeDisplayed());
//        Assert.assertTrue(homePage.isNumberFourDisplayed());
//        Assert.assertTrue(homePage.isNumberFiveDisplayed());
//        Assert.assertTrue(homePage.isNumberSixDisplayed());
//        Assert.assertTrue(homePage.isNumberSevenDisplayed());
//        Assert.assertTrue(homePage.isNumberEightDisplayed());
//        Assert.assertTrue(homePage.isNumberNineDisplayed());
//        Assert.assertTrue(homePage.isPlusDisplayed());
//        Assert.assertTrue(homePage.isMinusDisplayed());
//        Assert.assertTrue(homePage.isMultiplyDisplayed());
//        Assert.assertTrue(homePage.isDivideDisplayed());
//        Assert.assertTrue(homePage.isAllClearDisplayed());
//    }
   @Then("button {word} is displayed")
public void button_is_displayed(Integer int1) {
       System.out.println(int1);
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

}
@And("button = is displayed")
public void button_equal_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("button + is displayed")
public void button_plus_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("button - is displayed")
public void button_minus_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("button * is displayed")
public void button_multiply_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("button \\/ is displayed")
public void button_divide_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("button AC is displayed")
public void button_ac_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
    }

