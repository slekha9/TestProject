package getRequest;

import org.testng.Assert;

import org.testng.annotations.Test;

import static com.jayway.restassured.RestAssured.*;
import com.jayway.restassured.response.Response;

public class GetData
{
/*	@Test
	public void testResponseStatus()
	{
		Response response=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int status=response.getStatusCode();
		System.out.println("Status code is: "+status);
		Assert.assertEquals(status, 200);
		
		Long time=response.getTime();
		System.out.println("Response time is :" +time);
	}
	@Test
	public void testResposeBody()
	{
	Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");	
	String body=resp.toString();
	System.out.println(body);
	}*/
	
	//We will import static RestAssured- import static com.jayway.restassured.RestAssured.*; 

/*	@Test
	public void testResponseStatus()
	{
	Response resp=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	int status=resp.getStatusCode();
	System.out.println("Status code: " +status);
	Assert.assertEquals(status, 200);
	}
	@Test
	public void testResponseTime()
	{
		Response resp=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		long time=resp.getTime();
		System.out.println("Response time: "+time);
	}
	@Test
	public void testResponseBody()
	{
		Response resp=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String body=resp.toString();
		System.out.println("Response body: "+body);
	}
	*/
	//Optimized code
	@Test
	public void testResponse()
	{
		String apiUrl="http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";
		int status=get(apiUrl).getStatusCode();
		long time=get(apiUrl).getTime();
		String body=get(apiUrl).toString();
		System.out.println("Response status: " +status);
		System.out.println("Response time: "+time);
		System.out.println("Response body: "+body);
		Assert.assertEquals(status, 200);			
	}
}





