package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class WikiPage extends BaseCode {

public static List<String> getValue(int columnIndex){
 List<WebElement> co=  driver.findElements(By.xpath("//table[@class='wikitable']//tr//td["+columnIndex+"]"));
 List<String> columnValues = new ArrayList<String>();
 for(WebElement a:co){
    columnValues.add(a.getText());
     }
    return columnValues;
}
  public static WebElement getValue(int row, int column){
  return driver.findElement(By.xpath("//table[@class='wikitable'))//tr["+row+"]//td["+column+"]"));
  }
  public static List<String> getRowValue(int row){
    List<WebElement> rowValues= driver.findElements(By.xpath("table[@class='wikitable']))//tr["+row+"]/td"));
    List<String> rowValue = new ArrayList<String>();
    for(WebElement r:rowValues){
        rowValue.add(r.getText());
    }
    return rowValue;

  }
}
