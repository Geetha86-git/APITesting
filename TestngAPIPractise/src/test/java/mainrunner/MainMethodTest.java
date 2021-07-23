package mainrunner;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.IOException;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.Coreutils;
import resources.TestDataBuild;

public class MainMethodTest extends Coreutils{

	private RequestSpecification request;
	private Response response;
	TestDataBuild data = new TestDataBuild();
	
	@Test
	public void mainMethod() throws IOException
	{
		request = given().spec(requestSpecificationToMerge()).body(data.addPetfromExcel());
		request.when().post("/order").then().log().all().assertThat().statusCode(200);	
	}
}
