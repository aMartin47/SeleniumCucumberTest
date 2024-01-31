package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    static WebDriver driver;
    @Before(order = 1)
    public void startBrowser(){
        //driver = new ChromeDriver();
        System.out.println("antes de la prueba");
    }

    @Before(order = 2)
    public void doSomethingBefore() {
        System.out.println("antes de la prueba 2");
        driver.get("https://www.toolsqa.com/cucumber/cucumber-hooks/");
    }

    @After
    public void doSomethingAfter(Scenario scenario){
        System.out.println("despues de la prueba");
        //driver.close();
    }

}
