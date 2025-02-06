package api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endPoints.UserendPoint;
import api.payload.UserPayload;
import api.utilites.DataProviders;
import io.restassured.response.Response;

public class UserDataProviderTestcases {
	
	
	@Test(priority = 1,dataProvider = "Data",dataProviderClass = DataProviders.class )
	public void testpostUser(String userId,String username, String firstName, String lastName,String email, String password, String number)
	{
		UserPayload payload = new UserPayload();
		payload.setId(Integer.parseInt(userId));
		payload.setUsername(username);
		payload.setFirstName(firstName);
		payload.setLastName(lastName);
		payload.setEmail(email);
		payload.setPassword(password);
		payload.setPhone(number);
		Response response =UserendPoint.createUser(payload);
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(),200);
		
		
	}
	
	@Test(priority = 2,dataProvider = "getUsername",dataProviderClass = DataProviders.class)
	public void deleteUsername(String username)
	{
		
		Response response=UserendPoint.deleteUser(username);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}

}
