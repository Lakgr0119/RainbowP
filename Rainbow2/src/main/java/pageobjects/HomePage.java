package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BaseCode {
    public static void enterProductName(String productName) {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(productName);

    }
    public static void clickSearchIcon(){

        driver.findElement(By.id("nav-search-submit-button")).click();
    }
    public static void clickSignIn(){
        Actions a = new Actions(driver);
        WebElement signIn= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        a.clickAndHold(signIn).build().perform();
        driver.findElement(By.linkText("Sign in")).click();

  }

    }

