package resoucres;

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

	public static RequestSpecification request;
	
	public RequestSpecification requestSpecificationToMerge() throws IOException
	{
		if(request==null)
		{
			PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
			request = new RequestSpecBuilder().setBaseUri(getResource("uri"))
					  .addFilter(RequestLoggingFilter.logRequestTo(log))
					  .addFilter(ResponseLoggingFilter.logResponseTo(log))
					  .setContentType(ContentType.JSON).build();
		}
		return request;
	}
	
	public String getResource(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
