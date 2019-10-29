package co.com.accenture.automation.trivagoreserve.stepdefinitions;

import co.com.accenture.automation.trivagoreserve.tasks.GoTo;
import co.com.accenture.automation.trivagoreserve.tasks.OpenTheBrowser;
import co.com.accenture.automation.trivagoreserve.userinterfaces.TrivagoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TrivagoReserveStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;
    private Actor viviany = Actor.named("Viviany");
    private TrivagoHomePage pageTrivago;

    @Before
    public void setUp() {
        viviany.can(BrowseTheWeb.with(herBrowser));
    }

    @Given("^The user searches for a hotel  on page Trivago and selects the one of their choice$")
    public void theUserSearchesForAHotelOnPageTrivagoAndSelectsTheOneOfTheirChoice() throws Exception {

        viviany.wasAbleTo(OpenTheBrowser.on(pageTrivago));
        viviany.wasAbleTo(GoTo.thePage());
    }

    @When("^The user selects city destination \"([^\"]*)\" with arrival date \"([^\"]*)\" and departure date \"(\\d+)-(\\d+)-(\\d+) and check accommodation type and some services hotel$")
    public void theUserSelectsWithArrivalDateAndDepartureDateAndCheckAccommodationTypeAndSomeServicesHotel(List<List<String>> data) throws Exception {


    }

    @Then("^The user must see reserve and state of the hotel$")
    public void theUserMustSeeReserveAndStateOfTheHotel() throws Exception {


    }
}
