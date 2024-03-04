package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;
import reusable.ReadExcel;

import java.io.IOException;

public class SalesforceCode extends BaseCode {
    
    @When("user enters the user name {string} and password {string}")
    public void userEntersCredentials(String userName, String password) throws IOException {
        driver.findElement(By.id("username")).sendKeys(ReadExcel.getExcelData("logininfo",0,0));
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @And("user selects the login button")
    public void userSelectsTheLoginButton() {
        driver.findElement(By.id("Login")).click();
        
    }

    @Then("user validates the error message")
    public void userValidatesTheErrorMessage() {
        String actualError= driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(actualError);
        String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        Assert.assertEquals(expectedError,actualError);
       // if (actualError.equals(expectedError))
        {
          System.out.println("equal");
        }
       //else
        {
            System.out.println("not equal");
        }

    }

    @Then("verify whether user navigates to the homepage")
    public void homepageValidation() {
    }
}
