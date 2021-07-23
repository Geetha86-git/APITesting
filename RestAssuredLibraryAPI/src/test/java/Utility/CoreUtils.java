package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CoreUtils {

	public static RequestSpecification url;
	//String uri = "http://216.10.245.166";
	
	public RequestSpecification requestSpecification() throws IOException
	{
		if(url==null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			url = new RequestSpecBuilder().setBaseUri(getProperty("uri"))
					.addFilter(RequestLoggingFilter.logRequestTo(log)) 
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
		}
		return url;
	}
	
	public String getProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public String jsonValidation(Response res,String key)
	{
		String response = res.asString();
		JsonPath js = new JsonPath(response);
		return js.get(key).toString();		
	}
	
}
