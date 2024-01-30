package pageObjets;

import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class BasePage {

    public static String basicCalculatorButton = "//*[@id=\"gotoBasicCalc\"]/div";
    public static String numberGameButton = "//*[@id=\"gotoNumberGameButton\"]/div";


    public void goBasicCalculator (){
        driver.findElement(By.xpath(basicCalculatorButton)).click();
    }

    public void goNumberGame () {
        driver.findElement(By.xpath(numberGameButton)).click();
    }

}
