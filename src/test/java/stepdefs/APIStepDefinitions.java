package stepdefs;

import helper.APIHelper;
import helper.BaseObject;
import io.cucumber.java.en.And;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;

public class APIStepDefinitions {
    private static Response response;
    private static final Logger logger = LogManager.getLogger(APIStepDefinitions.class);

    @And("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) {
        APIHelper.get(url);
    }

    @And("I perform POST operation for {string} with payload {string}")
    public void iPerformPOSTOperationForWithPayload(String url, String payload) {
        APIHelper.post(url, payload);
    }

    @And("I create user with payload {string}")
    public void iCreateUserWithPayload(String payload) {
        APIHelper.post("public/v2/users/", payload);
    }

    @And("I get user with id {string}")
    public void iGetUserWithId(String id) {
        id = BaseObject.parseTestVariable(id);
        APIHelper.get("public/v2/users/" + id);
    }

    @And("I delete user with id {string}")
    public void iDeleteUserWithId(String id) {
        id = BaseObject.parseTestVariable(id);
        APIHelper.delete("public/v2/users/" + id);

    }

    @And("I verify response body item {string} is {string}")
    public void iVerifyResponseBodyItemIs(String key, String value) {
        Assert.assertEquals(BaseObject.getVariableByKey(key), value);
    }

    @And("I update user {string} with payload {string}")
    public void iUpdateUserWithPayload(String id, String paylod) {
        id = BaseObject.parseTestVariable(id);
        APIHelper.put("public/v2/users/" + id, paylod);
    }
}
