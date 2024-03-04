package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageobjects.GreenKartHomePage;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class GreenKartCodeSteps extends BaseCode {
    @Given("user enters the itemname")
    public void enterItemName(){
        GreenKartHomePage.searchItem("Brocolli");


    }

    

    @When("user clicks on search button")
    public void userClicksOnSearchButton() {
    }

    @Then("user navigates to the cartpage")
    public void userNavigatesToTheCartpage() {
    }

    @Given("user productValue")
    public void userProductValue() {
    GreenKartHomePage.getProductValue();

    }

    @When("user adds the products toCart")
    public void userAddsTheProductsToCart() {
        GreenKartHomePage.addProductToCart(2,3);
    }
}
