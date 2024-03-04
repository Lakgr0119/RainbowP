package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SignInPage extends BaseCode {
    public static void enterMailId(){
        driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("email"));
    }
    public static void clickContinue(){

        driver.findElement(By.id("continue")).click();
    }
    public static void enterPassword(){
        driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("password"));
    }
    public static void clickSignIn(){
        driver.findElement(By.id("signInSubmit")).click();
    }
    public static String getErrorMessage(){
       return driver.findElement(By.id("xyz")).getText();
    }
}
