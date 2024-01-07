package Pages;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class SignUpPage {
	
	private final String baseUrl = "https://www.demoblaze.com/";

    public void signup(String username, String password) {
        String signupEndpoint = baseUrl + "/signup";

        
        String jsonBody = "{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }";

       
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .post(signupEndpoint);

        
        int statusCode = response.getStatusCode();
        int expectedStatusCode = 200;
        Assert.assertEquals(statusCode, expectedStatusCode, "Incorrect status code");
    }

}
