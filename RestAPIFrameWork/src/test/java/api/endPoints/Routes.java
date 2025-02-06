package api.endPoints;

//swagers------------> https://petstore.swagger.io/#/user/
//This class only contains URL
//making static & public,m so that it can be access by class name & available to all and 

public class Routes {
	
	//user module
	public static String base_url="https://petstore.swagger.io/v2";
	public static String user_postUrl=base_url+"/user";
	public static String user_getUrl=base_url+"/user/{username}";
	public static String user_updateUrl=base_url+"/user/{username}";
	public static String user_deleteUrl=base_url+"/user/{username}";

	//store module
	
	
	// pet module
}
