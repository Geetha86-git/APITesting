package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import POJOClasses.AddPlace;
import POJOClasses.Location;
import io.cucumber.java.en.*;
import io.cucumber.java.it.Data;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResource;
import resources.Coreutils;
import resources.TestDataBuild;

public class StepFile extends Coreutils{
	
		TestDataBuild data = new TestDataBuild(); 
		RequestSpecification urlRes;
		Response actualResponse;
		static String placeID;
		
		/*@Given("Add_Place_payload")
		public void add_place_payload() throws IOException {*/
		    // Write code here that turns the phrase above into concrete actions		
			
			//RestAssured.baseURI = "https://rahulshettyacademy.com";
			
			/*String response = given().log().all().queryParam("key", "qaclick123").body(add)
			.when().post("maps/api/place/add/json").
			then().assertThat().statusCode(200).extract().response().asString();*/
		
		
		@Given("Add_Place_payload with {string} {string} {string}")
		public void add_place_payload_with(String name, String address, String language) throws IOException 
		{
				urlRes = given().spec(requestSpecification()).body(data.addPlacePayload(name,address,language));	
		}

		@When("user calls {string} with {string} http request")
		public void user_calls_with_post_http_request(String apiResource,String httpMethod) 
		{
			APIResource  resourceToCall = APIResource.valueOf(apiResource);
			if(httpMethod.equalsIgnoreCase("POST"))
			{
				actualResponse = urlRes.when().post(resourceToCall.getResource());
			}
			else
			{
				actualResponse = urlRes.when().get(resourceToCall.getResource());
			}
		}
		@Then("the API call got success with status code {int}")
		public void the_api_call_got_success_with_status_code(Integer statusCode) {
		    // Write code here that turns the phrase above into concrete actions
			assertEquals(actualResponse.getStatusCode(),200);
		}
		@Then("{string} in response body is {string}")
		public void in_response_body_is(String keyValue, String expectedValue) {
		  
		    assertEquals(jsonPath(actualResponse,keyValue),expectedValue);
		}

	@Then("verify place_id is obtained correctly for {string} as passed under {string}")
		public void verify_place_id_is_obtained_correctly_for_as_passed_under(String name, String apiResource) throws IOException {
			 
			placeID = jsonPath(actualResponse,"place_id");
			/*urlRes = given().spec(requestSpecification()).queryParam("Key", placeID);
			user_calls_with_post_http_request(apiResource,"GET");
			String extractedName = jsonPath(actualResponse, "name");
			assertEquals(extractedName,name);*/
			
		}

	@Given("Delete_Place_payload with {string}")
	  public void delete_place_payload_with(String string) throws IOException {
		    
		urlRes = given().spec(requestSpecification()).body(data.deletePayload(placeID));
		}

}
