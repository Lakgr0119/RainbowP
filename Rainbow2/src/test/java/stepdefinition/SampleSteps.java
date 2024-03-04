package stepdefinition;

import io.cucumber.java.en.Given;
import pageobjects.HomePage1;

public class SampleSteps {
    HomePage1 h;
    public SampleSteps(){

        h = new HomePage1();
        }
    @Given("Sample")
    public void m1(){
    h.enterProductName("table").clickSearchIcon();
    }
}
