package testRunner;

import io.restassured.response.Response;
import utils.application.API_SiginIn;

import java.net.MalformedURLException;

public class Runner {

    public static void main(String arg[]) throws MalformedURLException {
        API_SiginIn api_SiginIn = new API_SiginIn();
        Response resp = api_SiginIn.getSignInAPI();
        System.out.println("Response "+resp.print());

    }
}
