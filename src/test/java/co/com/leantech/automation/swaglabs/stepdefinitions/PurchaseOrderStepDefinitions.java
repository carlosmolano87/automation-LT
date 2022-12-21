package co.com.leantech.automation.swaglabs.stepdefinitions;
import co.com.leantech.automation.swaglabs.questions.SelectedProductNameQuestions;
import co.com.leantech.automation.swaglabs.tasks.Checkout;
import co.com.leantech.automation.swaglabs.tasks.FinishOrder;
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
import co.com.leantech.automation.swaglabs.questions.FinishOrderQuestions;

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
                        "Product Name", SelectedProductNameQuestions.SelectedProductNameShopingCart()
                ,equalTo("Sauce Labs Bolt T-Shirt")));
        theActorInTheSpotlight().attemptsTo(Checkout.checkoutorder());
        theActorInTheSpotlight().
                should(
                        seeThat(
                                "Product Name", SelectedProductNameQuestions.SelectedProductNameCheckoutOverview()
                                ,equalTo("Sauce Labs Bolt T-Shirt")));
        theActorInTheSpotlight().attemptsTo(FinishOrder.finishOrder());
        theActorInTheSpotlight().
                should(
                        seeThat(
                                "Finish Message", FinishOrderQuestions.FinishOrderTittle()
                                ,equalTo("Checkout: Complete!")));
    }

    @Then("^user sees registered order$")
    public void userSeesRegisteredOrder() {
    }

}
