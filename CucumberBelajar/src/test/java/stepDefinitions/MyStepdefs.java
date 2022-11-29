package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("I have <opening balance> beer cans")
    public void iHaveOpeningBalanceBeerCans() {
        System.out.println("Ini step pertama");
    }

    @And("I have drunk <processed> beer cans")
    public void iHaveDrunkProcessedBeerCans() {
        System.out.println("Ini step kedua");
    }

    @When("I go to my fridge")
    public void iGoToMyFridge() {
        System.out.println("Ini step ketiga");
    }

    @Then("I should have <in stock> beer cans")
    public void iShouldHaveInStockBeerCans() {
        System.out.println("Ini step keempat");
    }
}
