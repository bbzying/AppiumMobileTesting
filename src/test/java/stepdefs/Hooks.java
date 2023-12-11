package stepdefs;

import helper.APIHelper;
import helper.AppiumHelper;
import helper.BaseObject;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;

public class Hooks {
    @BeforeAll
    public static void setupAll(){
        AppiumHelper.startAppium();
        new APIHelper();
    }
    @AfterAll
    public static void teardownAll(){
        AppiumHelper.stopAppium();
    }
}
