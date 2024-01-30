package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjets.BasePage;
import pageObjets.NumberGame;
import static utilities.Tools.*;
public class stepDefNumberGame {

    @Given("User navigate to the Number Game Page")
    public void user_navigate_to_the_number_game_page() {
        driver.get("https://testsheepnz.github.io/index.html#page-top");
        BasePage.goNumberGame();
    }
    @When("start the game")
    public void start_the_game() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("try to guess the result")
    public void try_to_guess_the_result() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("get the number right in x tries")
    public void get_the_number_right_in_x_tries() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
