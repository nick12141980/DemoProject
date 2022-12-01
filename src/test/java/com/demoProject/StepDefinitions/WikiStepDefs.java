package com.demoProject.StepDefinitions;

import com.demoProject.pages.MainPage;
import com.demoProject.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class WikiStepDefs {

    MainPage page = new MainPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Driver.getDriver().manage().window().maximize();
    }
    @When("user enters a name in the search box")
    public void user_enters_a_name_in_the_search_box() {
        page.searchBox.sendKeys("Albert Einstein");

    }
    @And("user clicks search button")
    public void user_clicks_search_button() {
        page.searchButton.click();

    }
    @Then("user is navigated to correct page")
    public void user_is_navigated_to_correct_page() {

        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Albert Einstein"));

    }

}
