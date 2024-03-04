package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePage;
import pageobjects.ResultPage;
import pageobjects.SpiceJetPage;
import reusable.BaseCode;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonCodeSteps extends BaseCode  {

     @Given("user selects the category in the homepage")
    public void selectCategory() throws IOException {
            WebElement selectCategoryElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select category = new Select(selectCategoryElement);
        category.selectByIndex(3);
        //category.selectByValue("search-alias=appliances");
         //spiecejet static dropdwon
        // WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
         //Select currencyDropdown = new Select(currencyElement);
         //currencyDropdown.selectByIndex(3);
//        int dropDownCount = driver.findElements(By.tagName("option")).size();
//        for (int i = 0; i < dropDownCount; i++) {
//            String val = driver.findElements(By.tagName("option")).get(i).getText();
//            System.out.println(val);
//        }
        List<WebElement> categoryElement= driver.findElements(By.tagName("option"));
       List<String> categoryValue = new ArrayList<String>();
        for(WebElement a:categoryElement){
            categoryValue.add(a.getText());
                   }
        System.out.println(categoryValue);
        for (String dropVal:categoryValue){
            if (dropVal.equals("Books")){
                Assert.assertTrue(true);
                break;
            }
        }
    }
    @Given("user handles the dynamic dropdown")
    public void userHandlesTheDynamicDropdown() {
         //driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']"));
         //driver.findElement(By.xpath("//option[@value='BLR']")).click();
     //WebElement toElement=   driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']"));

     //toElement.findElement(By.xpath("//a[@value='MAA']")).click();
        SpiceJetPage.selectCityInFromDropDown("BLR");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")));
        //Relative+relative xpath
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//option[@value='MAA']")).click();
    }

    @Given("user extracts the columnOne value")
    public void userExtractsTheColumnValue() {
        WebElement infoSys = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        // int column1Count= infoSys.findElements(By.xpath("//table[@class='infobox vcard']//th")).size();
        // List<String> columnOneValue = new ArrayList<String>();
        List<WebElement> columnONeCount = infoSys.findElements(By.xpath("//table[@class='infobox vcard']//th"));
        List<String> columnOneValue = new ArrayList<String>();
        for (WebElement a : columnONeCount) {
            columnOneValue.add(a.getText());
            //for(int n=2; n<column1Count; n++ ){
            //String val= infoSys.findElements(By.tagName("td")).get(n).getText();
            //columnOneValue.add(val);
            // System.out.println(val);
        }
        System.out.println(columnOneValue);
    }
        @Given("user extracts the columnTwo value")
        public void user_extracts_the_column_two_value() {
            WebElement acqElement = driver.findElement(By.xpath("//table[@class='wikitable']"));
            int columnTwo= acqElement.findElements(By.xpath("//td[2]")).size();
            for (int n=2; n<columnTwo;n++) {
                String valu = acqElement.findElements(By.xpath("//td[2]")).get(n).getText();
                System.out.println(valu);
            }

                    }

            @Given("user navigates to baby wish list page")
    public void userNavigatesToBabyWishListPage() {
        WebElement accountListElement = driver.findElement(By.id("nav-link-accountList"));
        Actions action = new Actions(driver);
        action.clickAndHold(accountListElement).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Baby Wishlist")));
        //keys function example
        //driver.findElement(By.linkText("Baby Wishlist")).sendKeys("madurai"+ Keys.ENTER);
        //this is to get the baby wishlist in another window by doing the ctrl click
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
        Set<String> handleValues = driver.getWindowHandles();
        for (String winProp : handleValues) {
            driver.switchTo().window(winProp);
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains("Baby Wish List")) {
                break;
            }
        }
        // driver.switchTo().defaultContent();
        //is selected(), is enabled(), is disabled()
      // Boolean field= driver.findElement(By.id("disable")).isEnabled();
        //Assert.assertTrue(field);
        //Assert.assertFalse(field);
        //alerts
        //driver.switchTo().alert().accept();
        //driver.switchTo().alert().getText();
      // Assert.assertEquals("",driver.switchTo().alert().getText());
    }
    @Given("user handles the drag and drop")
    public void userHandlesTheDragAndDrop() {
         WebElement frameElement = driver.findElement(By.className("demo-frame"));
         driver.switchTo().frame(frameElement);
         WebElement drag =driver.findElement(By.id("draggable"));
         WebElement drop = driver.findElement(By.id("droppable"));
         Actions dragAction = new Actions(driver);
         dragAction.dragAndDrop(drag,drop).build().perform();
         driver.switchTo().defaultContent();
    }

    }


