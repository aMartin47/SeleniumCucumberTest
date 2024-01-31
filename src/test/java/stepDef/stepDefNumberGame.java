package stepDef;

import io.cucumber.java.After;
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
    @When("start the game with {string} options")
    public void startTheGameWithOptions(String arg0) throws InterruptedException {
        NumberGame.optionsGame(arg0);
    }
    @Then("try to guess the result and get the number right in x tries")
    public void try_to_guess_the_result_and_get_the_number_right_in_x_tries() {
        NumberGame.tryGuess();
    }



}
