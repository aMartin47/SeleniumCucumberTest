package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjets.BasePage;
import pageObjets.BasicCalculator;
import static utilities.Tools.*;

public class stepDefBasicCalculator {

    @Given("User navigate to the Basic Calculator Page")
    public void user_navigate_to_the_basic_calculator_page() throws InterruptedException {
        driver.get("https://testsheepnz.github.io/index.html#page-top");
        BasePage.goBasicCalculator();
    }
    @When("add the two numbers")
    public void add_the_numbers() {
        BasicCalculator.insertNumbers();
    }
    @And("select a sum operation")
    public void select_a_sum_operation() {
        BasicCalculator.selectSumOperation();
    }
    @Then("the calculator shows the right result")
    public void the_calculator_shows_the_right_result() {
        BasicCalculator.checkSumOperation();
    }
    @After()
    public void close(){
        driver.close();
    }

}
