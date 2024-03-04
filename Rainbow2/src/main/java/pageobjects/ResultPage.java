package pageobjects;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class ResultPage extends BaseCode {

        public static String getResultsPageTitle(){
        return driver.getTitle();
    }
    public static void selectResult(Integer index){

            driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']//a")).click();
    }

}
