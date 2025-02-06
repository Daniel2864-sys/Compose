package api.payload.tata.proposalCompose;

import static io.restassured.RestAssured.given;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Given;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;

public class ProposalPayloadView {
	String payloadBody;

	@BeforeTest
	public void payload() throws JsonProcessingException {
		
//		CustomerDetails customerDetails = new CustomerDetails("", "d@yahoo.in", "9452048146", "", "", "BNZPM2501F", "", true, "d manikandan", "", "");
//		OtherInsurane otherInsurane = new OtherInsurane("", "", "", "");
//		ConstructionDetails constructionDetails= new ConstructionDetails("", "", "");
//		Generic generic= new Generic("SHWETA MHATRE", "shwetabharat921@gmail.com", "3957945", "test");
//		
//		PAddress pAddress= new PAddress("India", "", "", "", "", "");
//		C_Address c_Address= new C_Address("India", "", "", "", "", "");
//		KycData kycData= new KycData("L40023734300279", "MR DURAISAMY MANIKANDAN", pAddress, c_Address, "9452048146_3e5e5171976f13da", true, null, "OK", "37", "MR DURAISAMY", "11-01-2017", "11-01-2017", "BNZPM2501F");
//		ProposalPayload payload= new ProposalPayload("qwert656788","31/01/2025", "No", "No", "", "", "","","", "", "", "", "", "", "", "", "", customerDetails, otherInsurane, constructionDetails, generic, true, kycData);
//        
//	   ObjectMapper objMap= new ObjectMapper();
//	     payloadBody= objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
//	    
	}
	
	@Test(priority = 1)
	public void proposalCompose(ITestContext context) throws JsonProcessingException
	{
		 LocalDate currentDate = LocalDate.now();
	        System.out.println("Current Date: " + currentDate);	
	        // Define a formatter
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        
	        // Convert LocalDate to String
	        String proposaldate = currentDate.format(formatter);
	        System.out.println("Proposal date is "+proposaldate);
	        
		String quoteId= (String) context.getAttribute("QuoteID");
		System.out.println("quote id is "+quoteId);
		CustomerDetails customerDetails = new CustomerDetails("", "d@yahoo.in", "9452048146", "", "", "BNZPM2501F", "", true, "d manikandan", "", "");
		OtherInsurane otherInsurane = new OtherInsurane("", "", "", "");
		ConstructionDetails constructionDetails= new ConstructionDetails("", "", "");
		Generic generic= new Generic("SHWETA MHATRE", "shwetabharat921@gmail.com", "3957945", "test");
		
		PAddress pAddress= new PAddress("India", "", "", "", "", "");
		C_Address c_Address= new C_Address("India", "", "", "", "", "");
		KycData kycData= new KycData("", "MR Daniel George", pAddress, c_Address, "9452048146_3e5e5171976f13da", true, null, "OK", "37", "MR Daniel", "11-01-2017", "11-01-2017", "AYNPG5438R");
		ProposalPayload payload= new ProposalPayload(quoteId,"27/02/2025", "No", "No", "", "", "","","", "", "", "", "", "", "", "", "", customerDetails, otherInsurane, constructionDetails, generic, true, kycData);
        
	   ObjectMapper objMap= new ObjectMapper();
	     payloadBody= objMap.writerWithDefaultPrettyPrinter().writeValueAsString(payload);
	     System.out.println(payloadBody);
//		
 		
 		
		 String token =(String) context.getAttribute("accessToken");
		     System.out.println("Context token in proposalcompose  "+token);
		Response response1=given()
					.auth().oauth2(token)
					.contentType("application/json")
					.body(payloadBody).
							
					when().post("https://uatapigw.tataaig.com/aigc-nb/v1/proposal");
			response1.then().log().all();
			System.out.println("status is "+response1.jsonPath().get("status"));
			Assert.assertEquals(response1.jsonPath().get("status"), 200);
			
			
			
			String paymentId=response1.jsonPath().get("data[0].payment_id");
			System.out.println("Payment id is"+paymentId);
			context.setAttribute("paymentID", paymentId);
			String policyStartDate= response1.jsonPath().get("data[0].policy_start_date");
			context.setAttribute("policyStartDate", policyStartDate);
			
			System.out.println("Premium check");
			int premiumValue= response1.jsonPath().get("data[0].final_premium");
			
			System.out.println("Premium is  "+premiumValue);
			
			context.setAttribute("premiumVal", premiumValue);
			
			
			
					//String quoteId=response1.jsonPath().get("data[0].quote_id").toString();
					//System.out.println(quoteId);
	
		
	}

}
