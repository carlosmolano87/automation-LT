package co.com.leantech.automation.swaglabs.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import static co.com.leantech.automation.swaglabs.userinterfaces.ShopingCart.SELECTED_PRODUCT_NAME;

public class SelectedProductName {

    public static Question<String> NombreProductoSeleccionado(){
        return actor -> TextContent.of(SELECTED_PRODUCT_NAME).viewedBy(actor).asString().trim();
    }
}
