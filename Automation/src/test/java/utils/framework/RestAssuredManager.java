package utils.framework;

import io.restassured.RestAssured;

import java.net.MalformedURLException;
import java.net.URL;

public class RestAssuredManager {

    public void setRestAPIServer(String serviceURL) throws MalformedURLException {
        URL url = new URL(serviceURL);
        String host = url.getProtocol()+"://"+url.getHost();
        RestAssured.baseURI = host;
        if(url.getPort() > 0){
            RestAssured.port = url.getPort();
        }
    }
}
