package co.com.leantech.automation.swaglabs.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/purchase_order.feature",
glue = "co.com.leantech.automation.swaglabs.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class PurchaseOrder {
}
