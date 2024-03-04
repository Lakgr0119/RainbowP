package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.HomePage;
import pageobjects.ResultPage;
import pageobjects.SignInPage;
import pageobjects.WikiPage;

import javax.naming.directory.SearchResult;

public class AmazonSteps {
    @Given("User enter the product name")
    public void enterTheProductName(){
        HomePage.enterProductName("iphone");
        HomePage.clickSearchIcon();
        
    }

    @Then("Validate the title of search result page")
    public void validateTheTitleOfSearchResultPage() {
        ResultPage.selectResult(4);
        Assert.assertEquals("Amazon.com.au : iphone", ResultPage.getResultsPageTitle());
    }

    @Given("user enters credentials")
    public void userEntersCredentials() {

        HomePage.clickSignIn();
        SignInPage.enterMailId();
        SignInPage.clickContinue();
        SignInPage.enterPassword();
        SignInPage.clickSignIn();
           }

    @Given("user extracts the values of the column")
    public void userExtractsTheValuesOfTheColumn() {
        WikiPage.getValue(4);

    }
}
