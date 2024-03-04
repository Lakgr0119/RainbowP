package automationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAutomation {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=au");
        driver.findElement(By.id("username")).sendKeys("learnmore");
        driver.findElement(By.id("password")).sendKeys("123");
        driver.findElement(By.id("Login")).click();
        String actualError= driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(actualError);
        String expectedError = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if (actualError.equals(expectedError))
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }

    }
}
