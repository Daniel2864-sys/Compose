package api.payload.tata.payment;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class PaymentApi {
	String payloadBody;
	
	@Test
	public void paymentFlow(ITestContext context) throws JsonProcessingException
	{
		String paymentId=(String) context.getAttribute("paymentID");
		String policyDate=(String) context.getAttribute("policyStartDate");
		//String paymentAmount=(String) context.getAttribute("premiumVal");
		String paymentAmount="7351";
		String txnDate= policyDate+" 07:05:00";
				
		PaymentData paymentData= new PaymentData(paymentId,"1234067899", "lcode", "MUMBAI", policyDate, paymentAmount, "", "customer", "atest126", "Mahesh Lekhwani", "", "ct120", "Success", "123786748345", txnDate);
		 ObjectMapper objMap= new ObjectMapper();
	     payloadBody= objMap.writerWithDefaultPrettyPrinter().writeValueAsString(paymentData);
	     System.out.println(payloadBody);
	     
	     String token =(String) context.getAttribute("accessToken");
	     System.out.println("Context token in payment api  "+token);
	Response response1=given()
				.auth().oauth2(token)
				.contentType("application/json")
				.header("x-api-key", "5QerRezeZs3PrVdLQu79c1v9Nsh5S7BOan26zc7P")
				
				.body(payloadBody).
						
				when().post("https://uatapigw.tataaig.com/payment/online_response?product=AIGC");
		response1.then().log().all();
		System.out.println("status is "+response1.jsonPath().get("status"));
		Assert.assertEquals(response1.jsonPath().get("status"), 200);
	
	
	}

}
