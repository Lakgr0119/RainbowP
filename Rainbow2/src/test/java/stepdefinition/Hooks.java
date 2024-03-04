package stepdefinition;

import io.cucumber.java.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

public class Hooks extends BaseCode {
    @Before
    public void setUp() throws IOException {
        BaseCode.launchBrowser();
    }

      @After
    public void tearDown()
      {
          System.out.println("execution ended");

      }
      @BeforeStep
    public void beforeStep()
      {
          System.out.println("before step");
      }
      @AfterStep
    public void takesScreenshot(Scenario sc){

          System.out.println("Screenshot taken");
         byte[] byteImage=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
         sc.attach(byteImage,"image/png", "test");
          //sc.attach(byteImage,"image/png",sc.getName());

      }
}
