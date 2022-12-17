package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShopingCart {

    public static final Target SELECTED_PRODUCT_NAME = Target.the("selected product").
            locatedBy("//div[@class=\"inventory_item_name\"]");
}
