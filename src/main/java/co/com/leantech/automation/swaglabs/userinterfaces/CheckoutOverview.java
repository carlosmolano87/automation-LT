package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutOverview {

    public static final Target SELECTED_PRODUCT_NAME_CHECKOUT_OVERVIEW = Target.the("selected product").
            locatedBy("//div[@class=\"inventory_item_name\"]");

    public static final Target FINISH_BUTTON = Target.the("selected product").
            locatedBy("//button[@id=\"finish\"]");
}
