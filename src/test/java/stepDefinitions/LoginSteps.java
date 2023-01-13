package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import screenplay.questions.ProductCatalog;
import screenplay.tasks.Login;

import static screenplay.model.Users.STANDARD_USER;

public class LoginSteps {

    @Given("{actor} is on login page")
    public void userIsOnLoginPage(Actor actor){
        actor.attemptsTo(Open.url("https://www.saucedemo.com/"));
    }
    
    @When("{actor} enters valid credentials")
    public void userEntersValidCredentials(Actor actor) {
        actor.attemptsTo(
                Login.asA(STANDARD_USER)
        );
    }

    @Then("{actor} should be able to see products catalog")
    public void userShouldBeAbleToSeeProductsCatalog(Actor actor) {
        actor.attemptsTo(
                Ensure.that("title",
                        ProductCatalog.itemName())
                        .isEqualToIgnoringCase("PRODUCTS"));
    }
}
