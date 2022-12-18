package co.com.leantech.automation.swaglabs.stepdefinitions;
import co.com.leantech.automation.swaglabs.questions.SelectedProductName;
import co.com.leantech.automation.swaglabs.tasks.Checkout;
import co.com.leantech.automation.swaglabs.tasks.PurchaseOrder;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class PurchaseOrderStepDefinitions {

    @Managed(driver="chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("carlos");
    }
    @Given("^user in the home page$")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.saucedemo.com/"));
    }


    @When("^user create a checkout order$")
    public void userCreateACheckoutOrder() {
        theActorInTheSpotlight().attemptsTo(PurchaseOrder.makeinformation());
        theActorInTheSpotlight().
                should(
                seeThat(
                        "Nombre de Producto", SelectedProductName.NombreProductoSeleccionado()
                ,equalTo("Sauce Labs Bolt T-Shirt")));
        theActorInTheSpotlight().attemptsTo(Checkout.checkoutorder());
    }

    @Then("^user sees registered order$")
    public void userSeesRegisteredOrder() {
    }

}
