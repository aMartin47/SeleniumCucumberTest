package pageObjets;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static utilities.Tools.*;
import static org.junit.Assert.assertEquals;

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


    public static void insertNumbers () {
        firstNumber = 25;
        secondNumber = 15;
        driver.findElement(By.xpath(firstNumField)).sendKeys(String.valueOf(firstNumber));
        driver.findElement(By.xpath(secondNumField)).sendKeys(String.valueOf(secondNumber));
    }
    public static void selectSumOperation () {
        driver.findElement(By.xpath(dropDownField)).click();
        driver.findElement(By.xpath(sumOperation)).click();
    }
    public static void checkSumOperation () {
        driver.findElement(By.xpath(calculateButton)).click();
        String answer = driver.findElement(By.xpath(answerField)).getText();
        System.out.println("El resultado es "+ answer);
    }

}
