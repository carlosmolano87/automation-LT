package co.com.leantech.automation.swaglabs.tasks;

import co.com.leantech.automation.swaglabs.userinterfaces.CheckoutOverview;
import co.com.leantech.automation.swaglabs.userinterfaces.Login;
import co.com.leantech.automation.swaglabs.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FinishOrder implements Task {

    static WebDriver driver;
    static WebDriverWait wait;

    String actualString;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutOverview.FINISH_BUTTON)

        );
    }

    public static FinishOrder finishOrder(){
        return instrumented(FinishOrder.class);
    }
}
