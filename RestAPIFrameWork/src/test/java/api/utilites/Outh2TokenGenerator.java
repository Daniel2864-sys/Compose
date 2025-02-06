package api.utilites;

import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import api.endPoints.Routes;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Outh2TokenGenerator {
	
	@BeforeSuite
	public void tokenGenerator(ITestContext context)
	{
		Response response =given().
		formParam("grant_type", "client_credentials")
		.formParam("scope", "https://api.iorta.in/write")
		.formParam("client_id", "44vbvh64bdu8tq6hfqkbreqma8")
		.formParam("client_secret", "1qrdk10gng4gvjpvd8v9tvf6oiin6655sdv03ljqqajhdk7v9mt1")
		.post("https://uatapigw-tataaig.auth.ap-south-1.amazoncognito.com/oauth2/token");
		
	//	System.out.println(response.jsonPath().prettify()); 
		String token = response.jsonPath().get("access_token");
		System.out.println(token);
		context.setAttribute("accessToken", token);
		
	}
	
	

}
