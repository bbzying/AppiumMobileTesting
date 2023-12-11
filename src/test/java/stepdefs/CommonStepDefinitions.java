package stepdefs;

import helper.BaseObject;
import io.cucumber.java.en.And;

public class CommonStepDefinitions {
    @And("I get test value {string}")
    public void iGetTestValue(String tv) {
        BaseObject.parseTestVariable(tv);
    }
}
