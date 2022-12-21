package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinishOrder {

    /*public static final Target FINISH_ORDER_TITTLE = Target.the("selected product").
            locatedBy("//div[@css=\".title\"]");*/

    public static final Target FINISH_ORDER_TITTLE = Target.the("selected product").
            locatedBy("//div[@id='header_container']/div[2]/span");
}
