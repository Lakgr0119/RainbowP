package reusable;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseCode {
    public static Properties prop;
    public  static WebDriver driver;
    public static void launchBrowser() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(new File("src/main/resources/confirguration/config.properties"));
        prop.load(fis);
        if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new InvalidArgumentException("please enter the valid browser name");

        }
        driver.get(prop.getProperty("environment"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
}
