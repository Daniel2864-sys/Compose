package api.payload.tata;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import api.endPoints.Routes;
import io.restassured.response.Response;

public class PayloadView {
	public String payloadBody;
	
     @BeforeTest
	public void payload() throws JsonProcessingException {
		InsuredDetails insure= new InsuredDetails("Mr", "Daniel", "", "george","Daniel", "7876452567", "aa@gmail.com");
		OptionalSI optionalSI= new OptionalSI("25000", "300000", "300000", "300000");
		OptionalValues optionalValues= new OptionalValues("", "", "", "", "");
		PropersDetails propersDetails= new PropersDetails("aad4", "aaad4", "", "452001");
		SiDetails siDetails= new SiDetails("5000000", "500000", "");
		String [] args= {"abc","abc"};
		// TODO Auto-generated method stub
		QuoteCreationPayload quoteCreationPayload= new QuoteCreationPayload("Flexi Sookshma","Agency" , "false", "", "Engineering Workshop (Others)", "10000000", "No", args, siDetails, insure, "", "", "Yes", propersDetails, "aaad8", "aad8", "", "171304", "2076", optionalSI, "No", "Abhishek", "1234067899", "Mumbai", optionalValues, "EDI", "Up to 20 years", "Age of the building", 0, "No", "Risk located on higher floors", 0, "Select", "Occupancy specific hazard mitigation measures", 0);
		
		ObjectMapper objmap = new ObjectMapper();
		payloadBody=objmap.writerWithDefaultPrettyPrinter().writeValueAsString(quoteCreationPayload);
		//System.out.println(payloadBody);

	}
     @Test (priority = 1)
 	public void quoteCompose(ITestContext context)
 	{
// 		Response response =given().
// 		formParam("grant_type", "client_credentials")
// 		.formParam("scope", "https://api.iorta.in/write")
// 		.formParam("client_id", "44vbvh64bdu8tq6hfqkbreqma8")
// 		.formParam("client_secret", "1qrdk10gng4gvjpvd8v9tvf6oiin6655sdv03ljqqajhdk7v9mt1")
// 		.post("https://uatapigw-tataaig.auth.ap-south-1.amazoncognito.com/oauth2/token");
// 		
// 
// 		String token = response.jsonPath().get("access_token");
// 		System.out.println(token);
 		
 		     String token =(String) context.getAttribute("accessToken");
 		     System.out.println("Context token in quotecompose "+token);
 			Response response1=given()
 					.auth().oauth2(token)
 					.contentType("application/json")
 					.body(payloadBody).
 							
 					when().post("https://uatapigw.tataaig.com/aigc-nb/v1/quote");
 			response1.then().log().all();
 			Assert.assertEquals(response1.getStatusCode(), 200);
 					String quoteId=response1.jsonPath().get("data[0].quote_id").toString();
 					System.out.println(quoteId);
 					context.setAttribute("QuoteID", quoteId);
 		
 		
 	}  
     
     

}
