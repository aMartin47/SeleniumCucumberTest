package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public ChromeOptions options;

    public BrowserDriver(){
        System.setProperty("webdriver.chrome.driver", System.getProperty(("user.dir")+"src/test/resources/drivers/chromedriver.exe"));
        driver = new ChromeDriver();
    }

    public void close(){

    }
}
