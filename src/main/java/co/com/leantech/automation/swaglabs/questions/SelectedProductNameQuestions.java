package co.com.leantech.automation.swaglabs.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import static co.com.leantech.automation.swaglabs.userinterfaces.ShopingCart.SELECTED_PRODUCT_NAME_SHOPING_CART;
import static co.com.leantech.automation.swaglabs.userinterfaces.CheckoutOverview.SELECTED_PRODUCT_NAME_CHECKOUT_OVERVIEW;

public class SelectedProductNameQuestions {

    public static Question<String> SelectedProductNameShopingCart(){
        return actor -> TextContent.of(SELECTED_PRODUCT_NAME_SHOPING_CART).viewedBy(actor).asString().trim();
    }

    public static Question<String> SelectedProductNameCheckoutOverview(){
        return actor -> TextContent.of(SELECTED_PRODUCT_NAME_CHECKOUT_OVERVIEW).viewedBy(actor).asString().trim();
    }
}
