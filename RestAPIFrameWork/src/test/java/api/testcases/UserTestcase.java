package api.testcases;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endPoints.UserendPoint;
import api.payload.UserPayload;
import io.restassured.internal.http.HttpResponseException;
import io.restassured.response.Response;

public class UserTestcase {
	
	Faker faker;
	UserPayload payload;

	@BeforeTest
	public void setupData()
	{
		faker= new Faker();
		payload= new UserPayload();
		
		payload.setId(faker.idNumber().hashCode());
		payload.setUsername(faker.name().username());
		payload.setFirstName(faker.name().firstName());
		payload.setLastName(faker.name().lastName());
		payload.setEmail(faker.internet().safeEmailAddress());
		payload.setPassword(faker.internet().password(5, 8));
		payload.setPhone(faker.phoneNumber().cellPhone());
		//System.out.println("Before class "+this.payload.getFirstName());
	}
	@Test
	public void show()
	{
		System.out.println(payload.getFirstName());
	}
	
	
	@Test(priority = 1)
	public void testpostUser()
	{
		System.out.println("post method");	
	Response response=	UserendPoint.createUser(payload);
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test(priority = 2)
	public void testgetUser()
	{
		System.out.println("get method");	
		Response response= UserendPoint.getUser(this.payload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority = 3)
	public void testputUser()
	{
		System.out.println("put method");
		payload.setFirstName(faker.name().firstName());
		payload.setLastName(faker.name().lastName());
		payload.setEmail(faker.internet().safeEmailAddress());
		
	Response response=	UserendPoint.updateUser(payload,this.payload.getUsername());
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(), 200);
	
	 response= UserendPoint.getUser(this.payload.getUsername());
	response.then().log().all();
	Assert.assertEquals(response.getStatusCode(), 200);
	}

}
