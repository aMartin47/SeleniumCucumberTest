package pageObjets;

import org.junit.Assert;
import org.openqa.selenium.By;

import static utilities.BrowserDriver.driver;

public class BasicCalculator {

    public static String firstNumField = "//*[@id=\"number1Field\"]";
    public static String secondNumField = "//*[@id=\"number2Field\"]";
    public static String dropDownField = "//*[@id=\"selectOperationDropdown\"]";
    public static String sumOperation = "//*[@id=\"selectOperationDropdown\"]/option[1]";
    public static String subtractOperation = "//*[@id=\"selectOperationDropdown\"]/option[2]";
    public static String multiplyOperation = "//*[@id=\"selectOperationDropdown\"]/option[3]";
    public static String divideOperation = "//*[@id=\"selectOperationDropdown\"]/option[4]";
    public static String concatenateOperation = "//*[@id=\"selectOperationDropdown\"]/option[5]";
    public static String calculateButton = "//*[@id=\"calculateButton\"]";
    public static String answerField = "//*[@id=\"numberAnswerField\"]";
    public static String clearButton = "//*[@id=\"clearButton\"]";


    public static Integer firstNumber;
    public static Integer secondNumber;
    public static Integer resultNumber;
    public static Integer answerNumber;


    public void insertNumbers () {
        firstNumber = 25;
        secondNumber = 15;
        driver.findElement(By.xpath(firstNumField)).sendKeys(String.valueOf(firstNumber));
        driver.findElement(By.xpath(secondNumField)).sendKeys(String.valueOf(secondNumber));
    }
    public void selectSumOperation () {
        driver.findElement(By.xpath(dropDownField)).click();
        driver.findElement(By.xpath(sumOperation)).click();
    }
    public void checkSumOperation () {
        String a; String b; String c;
        driver.findElement(By.xpath(calculateButton)).click();
        a = driver.findElement(By.xpath(firstNumField)).getText();
        b = driver.findElement(By.xpath(secondNumField)).getText();
        c = driver.findElement(By.xpath(answerField)).getText();
        firstNumber = Integer.parseInt(a);
        secondNumber = Integer.parseInt(b);
        resultNumber = Integer.parseInt(c);
        Assert.assertEquals(firstNumber,resultNumber);
    }

}
