package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class GreenKartHomePage extends BaseCode {
    public static void searchItem(String itemName) {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(itemName);

    }

    public static void getProductValue() {
        List<WebElement> productValue = driver.findElements(By.xpath("//div[@class='products']"));
        List<String> productName = new ArrayList<String>();
        for (WebElement a : productValue) {
            productName.add(a.getText());
                   }
        System.out.println(productName);
            }
      public static void addProductToCart(Integer Index, Integer Index1){
          driver.findElement(By.xpath("//div[@class='products']//div["+Index+"]")).click();


      }


}