package co.com.leantech.automation.swaglabs.tasks;

import co.com.leantech.automation.swaglabs.userinterfaces.CheckoutInfo;
import co.com.leantech.automation.swaglabs.userinterfaces.Login;
import co.com.leantech.automation.swaglabs.userinterfaces.ShopingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {

    static WebDriver driver;
    static WebDriverWait wait;

    String actualString;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShopingCart.CHECKOUT_BUTTON),
                SendKeys.of("carlos").into(CheckoutInfo.FIRST_NAME),
                SendKeys.of("molano").into(CheckoutInfo.LAST_NAME),
                SendKeys.of("9001").into(CheckoutInfo.POSTAL_CODE),
                Click.on(CheckoutInfo.CONTINUE)
        );
    }

    public static Checkout checkoutorder(){
        return instrumented(Checkout.class);
    }
}
