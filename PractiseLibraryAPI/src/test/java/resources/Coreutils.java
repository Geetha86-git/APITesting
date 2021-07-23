package resources;

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

public class Coreutils {

	private static RequestSpecification request;
	
	public RequestSpecification requestSpecificationToMerge() throws IOException
	{
		if(request == null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("loggin.txt"));
			request = new RequestSpecBuilder().setBaseUri(getProperty("uri"))
					.addFilter(RequestLoggingFilter.logRequestTo(log))
					.addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setContentType(ContentType.JSON).build();
		}
		return request;
	}
	
	public String getProperty(String key) throws FileNotFoundException
	{
		Properties prop = new Properties();
		FileInputStream fis =  new FileInputStream(System.getProperty("user.dir")+"\\global.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public String jsonValidation(Response res,String key)
	{
		String result = res.asString();
		JsonPath js = new JsonPath(result);
		return js.getString(key);
	}
}
