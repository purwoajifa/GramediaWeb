package steps_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.checkerframework.checker.lock.qual.EnsuresLockHeld;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    @Given("User is on Gramedia Landing Page")
    public void userIsOnLandingPage(){
        System.out.println("masuk");
        loginPage.isOnLandingPage();
    }

    @When("User click button Masuk")
    public void userClickButtonMasuk(){
        loginPage.clickButtonMasuk();
    }

    @And("User input email {string}")
    public void userInputEmail(String email){
        loginPage.inputEmail(email);
    }

    @And("User input password {string}")
    public void userInputPassword(String password){
        loginPage.inputPassword(password);
    }

    @And("User click button submit Masuk")
    public void userClickButtonSubmit(){
        loginPage.clickSubmit();;
    }

    @Then("User is on Gramedia Homepage")
    public void userIsOnGramediaHomepage(){

    }

    @When("User search {string} in searchbar")
    public void userSearch(String name){
        loginPage.search(name);
    }

    @Then("User in search result {string}")
    public void inSearchResult(String name){
        loginPage.inSearchResult(name);
    }
}
