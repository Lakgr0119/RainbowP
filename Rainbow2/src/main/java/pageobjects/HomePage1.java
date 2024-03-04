package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class HomePage1 extends BaseCode {
    public HomePage1 enterProductName(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);
        return this;

    }
    public HomePage1 clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
        return this;
    }
    public HomePage1 clickSignIn(){
        Actions a = new Actions(driver);
        WebElement signIn= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        a.clickAndHold(signIn).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
       return this;
  }

    }

