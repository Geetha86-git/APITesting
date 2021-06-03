package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.*;

public class Coreutils {

	public static RequestSpecification req;
	
	public RequestSpecification requestSpecification() throws IOException
	{
		if(req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));		
		req =  new RequestSpecBuilder().setBaseUri(getProperty("baseURI"))
				.addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setContentType(ContentType.JSON).build();
		return req;
		}
		return req;			
	}
	
	public String getRequestedString(Response response,String keyValue)
	{
		String actualResponse = response.asString();
		JsonPath js = new JsonPath(actualResponse);
		return js.get(keyValue).toString();
	}
	
	public String getProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
		
	}
	
}
