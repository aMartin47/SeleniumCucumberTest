package pageObjets;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static utilities.Tools.*;
import static org.junit.Assert.assertEquals;

public class NumberGame {


    public static String dropDownField = "//*[@id=\"buildNumber\"]";
    public static String emptyValue = "//*[@id=\"buildNumber\"]/option[1]";
    public static String demoValue = "//*[@id=\"buildNumber\"]/option[2]";
    public static String value1 = "//*[@id=\"buildNumber\"]/option[3]";
    public static String value2 = "//*[@id=\"buildNumber\"]/option[4]";
    public static String value3 = "//*[@id=\"buildNumber\"]/option[5]";
    public static String value4 = "//*[@id=\"buildNumber\"]/option[6]";
    public static String value5 = "//*[@id=\"buildNumber\"]/option[7]";
    public static String value6 = "//*[@id=\"buildNumber\"]/option[8]";
    public static String value7 = "//*[@id=\"buildNumber\"]/option[9]";
    public static String value8 = "//*[@id=\"buildNumber\"]/option[10]";
    public static String value9 = "//*[@id=\"buildNumber\"]/option[11]";
    public static String value10 = "//*[@id=\"buildNumber\"]/option[12]";
    public static String value11 = "//*[@id=\"buildNumber\"]/option[13]";
    public static String value12 = "//*[@id=\"buildNumber\"]/option[14]";
    public static String value13 = "//*[@id=\"buildNumber\"]/option[15]";
    public static String rollDiceBtn = "//*[@id=\"rollDiceButton\"]";


    public static String guessField = "//*[@id=\"numberGuess\"]";
    public static String submitBtn = "//*[@id=\"submitButton\"]";
    public static String cluedo = "//*[@id=\"feedbackLabel\"]/font/b/i";

    public static void optionsGame(String opt) throws InterruptedException {

        if (opt.equals("Demo")){
            driver.findElement(By.xpath(dropDownField)).click();
            driver.findElement(By.xpath(demoValue)).click();
            driver.findElement(By.xpath(rollDiceBtn)).click();
        }else {
            driver.findElement(By.xpath(dropDownField)).click();
            int i = 2+Integer.parseInt(opt);
            driver.findElement(By.xpath("//*[@id=\"buildNumber\"]/option["+i+"]")).click();
            driver.findElement(By.xpath(rollDiceBtn)).click();

        }
        Thread.sleep(2000);

    }

    public static void tryGuess(){

        int i=1;
        while (i<=13){
            driver.findElement(By.xpath(guessField)).sendKeys(String.valueOf(i));
            driver.findElement(By.xpath(submitBtn)).click();

            if(driver.findElement(By.xpath(cluedo)).getText().contains("Correct")){
                System.out.println(driver.findElement(By.xpath(cluedo)).getText());
                break;
            }else {
                System.out.println(driver.findElement(By.xpath(cluedo)).getText());
                i++;
            }

        }

    }

}
