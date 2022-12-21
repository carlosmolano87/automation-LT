package co.com.leantech.automation.swaglabs.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import static co.com.leantech.automation.swaglabs.userinterfaces.FinishOrder.FINISH_ORDER_TITTLE;


public class FinishOrderQuestions {
    public static Question<String> FinishOrderTittle(){
        return actor -> TextContent.of(FINISH_ORDER_TITTLE).viewedBy(actor).asString().trim();
    }

}
