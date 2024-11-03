package com.autodesk.stepdefinitions;

import com.autodesk.pages.HomePage;
import com.autodesk.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Map;
import static org.yaml.snakeyaml.tokens.Token.ID.Value;

public class VerifyCalculatorTool {
    HomePage homePage = new HomePage();

    @Given("user is navigated successfully to Google home page")
    public void user_is_navigated_successfully_to_google_home_page() throws InterruptedException {
        Driver.getDriver().get("https://www.google.com/search?client=firefox-b-d&q=calculator");
        Thread.sleep(1000);
    }

    @Then("user is able to see below calculator details:")
    public void user_is_able_to_see_below_calculator_details(DataTable dataTable) {
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//table[@class='ElumCf']//td"));
        /**
         * Maps will help us to store the data in key value pair
         * Key will be the column name from the feature file and value will be the value from the feature file
         * Key is button and isDisplayed
         */
        List<Map<String, String>> calculatorDetails = dataTable.asMaps();

        /**
         * We are iterating through the list of maps and getting the button and isDisplayed value
         * We are verifying the button is displayed or not based on the isDisplayed value
         * If the element matches the button from the feature file, we are verifying the button is displayed or not
         */
        for (int i = 0; i < calculatorDetails.size(); i++) {
            String button = calculatorDetails.get(i).get("button");
            boolean isDisplayedFromGherkinTable = Boolean.parseBoolean(calculatorDetails.get(i).get("isDisplayed"));
            System.out.println("We are verifying the button: " + button + " is displayed: " + isDisplayedFromGherkinTable);
            for (WebElement element : elements) {
                //We only verify the button if it is displayed for the ones that are coming from feature file
                if (element.getText().equals(button)) {
                    //We are verifying the button is displayed against the column isDisplayed from the feature file
                    Assert.assertEquals(element.isDisplayed(),isDisplayedFromGherkinTable);
                }
            }
        }
    }
}