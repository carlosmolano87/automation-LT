package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInfo {
    public static final Target FIRST_NAME = Target.the("first name").
            locatedBy("//input[@id=\"first-name\"]");
    public static final Target LAST_NAME = Target.the("last name").
            locatedBy("//input[@id=\"last-name\"]");
    public static final Target POSTAL_CODE = Target.the("postal code").
                    locatedBy("//input[@id=\"postal-code\"]");
    public static final Target CONTINUE = Target.the("continue").
            locatedBy("//input[@id=\"continue\"]");
}
