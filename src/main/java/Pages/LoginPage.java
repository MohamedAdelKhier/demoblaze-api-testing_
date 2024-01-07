package Pages;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class LoginPage {

	
	private final String baseUrl = "https://www.demoblaze.com/";

    public void login(String username, String password) {
        String loginEndpoint = baseUrl + "/login";

        
        String jsonBody = "{ \"username\": \"" + username + "\", \"password\": \"" + password + "\" }";

        
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(jsonBody)
                .post(loginEndpoint);

        
        int statusCode = response.getStatusCode();
        int expectedStatusCode = 200;
        Assert.assertEquals(statusCode, expectedStatusCode, "Incorrect status code");
        
        
    }
}
