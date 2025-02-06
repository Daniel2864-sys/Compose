package api.endPoints;

import api.payload.UserPayload;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

//CRUD operations Create, read, update delete
//create -----header---body
//read----parameter
//update-------header---body--parmater
//delete----parameter


//given consist of  Content_type & body & param
//when ....fumction post put delete 

public class UserendPoint {
	
	public static Response createUser(UserPayload payload)
	{
		Response response=given()
		.contentType("application/json")
		.body(payload).
				
		when().post(Routes.user_postUrl);
		return response;
		
	}
	public static Response getUser(String userName)
	{
		Response response=given().pathParam("username", userName)
		
				
		.when().get(Routes.user_getUrl);
		return response;
		
	}
	public static Response updateUser(UserPayload payload,String userName)
	{
		Response response=given()
		.contentType("application/json").pathParam("username", userName)
		.body(payload).
				
		when().put(Routes.user_updateUrl);
		return response;
		
	}
	public static Response deleteUser(String userName)
	{
		Response response=given().pathParam("username", userName)
		
				
		.when().delete(Routes.user_getUrl);
		return response;
		
	}
	

}
