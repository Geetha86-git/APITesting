package stepdefinitions;

import io.cucumber.java.en.*;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resoucres.APIResources;
import resoucres.Coreutils;
import resoucres.TestDataBuild;

public class StepFile extends Coreutils{

	RequestSpecification request;
	Response res;
	
	TestDataBuild data = new TestDataBuild();
	
		@Given("to get the store status using inventory")
	public void to_get_the_store_status_using_inventory() throws IOException {
	    
		request = given().spec(requestSpecificationToMerge());
	}
	@When("the user calls the {string} method using {string}")
	public void the_user_calls_the_method_using(String httpMethod, String APIDetails) {

		APIResources api = APIResources.valueOf(APIDetails);
		if(httpMethod.equalsIgnoreCase("Post"))
		{
			res=request.when().post(api.getResource());
		}
		else
		{
			res=request.when().get(api.getResource()); 
		}
	}
	@Then("Validate the status code as {int}")
	public void validate_the_status_code_as(int code) {
		 
	    assertEquals(res.getStatusCode(),code);
	}
	
	@Given("to post the pet details using {int} {int} {int} {string} {string} {string}")
	public void to_post_the_pet_details_using(Integer id, Integer petId, Integer quantity, String shipDate, String status, String complete) throws IOException {
	    request = given().spec(requestSpecificationToMerge()).body(data.addPet(id, petId, quantity, shipDate, status, complete));
	}

	
	@Given("to get the store status using inventory using {int}")
	public void to_get_the_store_status_using_inventory_using(Integer orderId) throws IOException {
	    request = given().spec(requestSpecificationToMerge()).pathParam("orderId", orderId);
	}





}
