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
import io.restassured.specification.RequestSpecification;

public class Coreutils {

	private static RequestSpecification req;
	
	public RequestSpecification requestSpecificationToMerge() throws IOException
	{
		if(req==null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			req = new RequestSpecBuilder().setBaseUri(getResources("uri"))
				  .addFilter(RequestLoggingFilter.logRequestTo(log))
				  .addFilter(ResponseLoggingFilter.logResponseTo(log))
				  .setContentType(ContentType.JSON).build();
		}
		return req;
	}
	
	public String getResources(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
