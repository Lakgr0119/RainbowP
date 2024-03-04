package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SpiceJetPage extends BaseCode {
    public static void selectCityInFromDropDown(String cityName){
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR']//a[@value='"+cityName+"']")).click();

    }
}
