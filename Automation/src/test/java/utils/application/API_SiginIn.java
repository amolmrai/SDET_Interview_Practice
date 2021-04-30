package utils.application;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.framework.RestAssuredManager;

import java.net.MalformedURLException;

public class API_SiginIn {
    String URI = "https://www.macys.com/account-xapi/api/account/signin";
    Response response ;
    RestAssuredManager restAssuredManager = new RestAssuredManager();


    public Response getSignInAPI() throws MalformedURLException {
       // restAssuredManager.setRestAPIServer(URI);
        response = RestAssured.given().get(URI).thenReturn();
//get("/lotto").then().body("lotto.lottoId", equalTo(5));
        return response;
    }


}
