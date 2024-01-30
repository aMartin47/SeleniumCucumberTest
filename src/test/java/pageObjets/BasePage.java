package pageObjets;

import org.openqa.selenium.By;
import static utilities.Tools.*;

public class BasePage {

    public static String basicCalculatorButton = "//*[@id='gotoBasicCalc']/div";
    public static String numberGameButton = "//*[@id=\"gotoNumberGameButton\"]/div";


    public static void goBasicCalculator() throws InterruptedException {

        driver.findElement(By.xpath(basicCalculatorButton)).click();
    }

    public static void goNumberGame () {
        driver.findElement(By.xpath(numberGameButton)).click();
    }

}
