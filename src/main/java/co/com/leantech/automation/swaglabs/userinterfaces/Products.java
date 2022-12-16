package co.com.leantech.automation.swaglabs.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Products {
    public static final Target ADDTOCART = Target.the("add to cart").
            locatedBy("//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
  /*  public static final Target SAUCELABSBOLTTSHIRT= Target.the("saucelabsbolttshirt").
            locatedBy("//div[@class=\"inventory_item_name\"]");*/
    public static final Target SHOPPINGCART = Target.the("shopping cart").
            locatedBy("//div[@id=\"shopping_cart_container\"]");
}
