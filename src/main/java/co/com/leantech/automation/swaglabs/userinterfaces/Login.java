package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Login {

    public static final Target USERNAME = Target.the("username").
            locatedBy("//input[@id=\"user-name\"]");
    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");
    public static final Target LOGIN = Target.the("login button").
            //locatedBy("//a[@class=\"submit-button btn_action\"]");
            locatedBy("//input[@id=\"login-button\"]");



}
