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

	public static RequestSpecification request;
	ResponseSpecification response;
	
	public PrintStream logData() throws FileNotFoundException
	{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		return log;
	}	
	
	public RequestSpecification requestSpecification() throws IOException
	{
		if(request==null)
		{			
			PrintStream log1 = new PrintStream(new FileOutputStream("logging1.txt"));
			request = new RequestSpecBuilder().setBaseUri(getProperty("baseURI")).addQueryParam("key", "qaclick123")
					.addFilter(RequestLoggingFilter.logRequestTo(log1))
					.addFilter(ResponseLoggingFilter.logResponseTo(log1))
					.setContentType(ContentType.JSON).build();
			return request;
		}
		return request;
	}
	
	public ResponseSpecification responseSpecification()
	{
		response = new ResponseSpecBuilder().expectStatusCode(200).build();
		return response;
	}
	
	public String getProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public String jsonPath(Response response, String keyValue)
	{
		String res = response.asString();
		JsonPath js = new JsonPath(res);
		return js.get(keyValue).toString();
	}
}
