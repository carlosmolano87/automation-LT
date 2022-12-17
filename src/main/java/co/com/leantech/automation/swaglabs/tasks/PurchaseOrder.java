package co.com.leantech.automation.swaglabs.tasks;

import co.com.leantech.automation.swaglabs.userinterfaces.Login;
import co.com.leantech.automation.swaglabs.userinterfaces.Products;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.junit.Assert.assertTrue;

public class PurchaseOrder implements Task {

    static WebDriver driver;
    static WebDriverWait wait;

    String actualString;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("standard_user").into(Login.USERNAME),
                SendKeys.of("secret_sauce").into(Login.PASSWORD),
                Click.on(Login.LOGIN),
                Click.on(Products.ADDTOCART),
                Click.on(Products.SHOPPINGCART)
                //driver.findElement(By.xpath("//a[@id=\"item_1_title_link\"]/div"))
                //div[@id=\"shopping_cart_container\"]"

        );
    }

    public static PurchaseOrder makeinformation(){
        return instrumented(PurchaseOrder.class);
    }
}
