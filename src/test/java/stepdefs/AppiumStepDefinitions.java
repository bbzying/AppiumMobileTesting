package stepdefs;

import helper.AppiumHelper;
import io.cucumber.java.en.And;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static org.assertj.core.api.Assertions.*;

import java.net.MalformedURLException;

public class AppiumStepDefinitions {
    private static final Logger logger = LogManager.getLogger(AppiumStepDefinitions.class);
    AppiumHelper helper = new AppiumHelper();


    @And("I setup Appium")
    public void iSetupAppium() throws MalformedURLException {
        AppiumHelper.initDriver();
    }

    @And("I tear down")
    public void iTearDown() {
        AppiumHelper.quitDriver();
    }

    @And("I click on menu {string}")
    public void iClickOnMenu(String menu){
        helper.clickOnElementWithText(menu);
    }

    @And("I populate checkbox {string} with {string}")
    public void iPopulateCheckboxWith(String name, String value) {
        helper.populateCheckboxWith(name, value);
    }

    @And("I wait for {string} seconds")
    public void iWaitForSeconds(String seconds){
        helper.waitForSeconds(seconds);
    }

    @And("I populate field {string} with {string}")
    public void iPopulateFieldWith(String name, String value) {
        helper.populateFieldWith(name, value);
    }

    @And("I click on button {string}")
    public void iClickOnButton(String name) {
        helper.clickOnButton(name);
    }

    @And("I verify text {string} is present")
    public void iVerifyTextIsPresent(String text) {
        boolean isPresent = helper.verifyTextIsPresent(text);
        assertThat(isPresent).isTrue();
    }

    @And("I verify text {string} is not present")
    public void iVerifyTextIsNotPresent(String text) {
        boolean isPresent = helper.verifyTextIsPresent(text);
        assertThat(isPresent).isFalse();
    }
}
