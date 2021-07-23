package SerializeTest;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import POJOClasses.*;

public class SerializeTest {

	public static void main(String[] args)
	{
		
		RequestSpecification request = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		ResponseSpecification response = new ResponseSpecBuilder().expectStatusCode(200).build();
		
		AddPlace add = new AddPlace();
		Location l = new Location();
		
		l.setLat(34.5567);
		l.setLng(35.667);
		add.setAccuracy(50);
		add.setAddress("191,Shiradi Avenue");
		add.setLanguage("Tamil");
		add.setName("Geetha");
		add.setPhone_number("99867545");
		add.setWebsite("learners.java.com");
		add.setLocation(l);
		List<String> types = new ArrayList<String>();
		 types.add("sock");
		 types.add("park");
		 
		 add.setTypes(types);
		
		//RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		/*String response = given().log().all().queryParam("key", "qaclick123").body(add)
		.when().post("maps/api/place/add/json").
		then().assertThat().statusCode(200).extract().response().asString();*/
		
		RequestSpecification urlRes = given().spec(request).body(add);
		
		String expectedResponse = urlRes.when().post("maps/api/place/add/json").then().spec(response).extract().asString();
		
		System.out.println(expectedResponse);
		
	}
}
