package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.APIResource;
import resources.Coreutils;
import resources.Testdatabuild;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class stepFile extends Coreutils{
	
		Testdatabuild data = new Testdatabuild();
		RequestSpecification urlRes;
		Response res;
		JsonPath js;
		
			@Given("add_New_Pet to the store with {string} {int}")
			public void add_new_pet_to_the_store_with(String name, Integer id) throws IOException {
				
				urlRes = given().spec(requestSpecification()).body(data.addPet(name, id));
			}

			@When("the user click the {string} API using {string} method")
			public void the_user_click_the_api_using_method(String APIRequest, String httpMethod) {
			    
				APIResource resourceCall = APIResource.valueOf(APIRequest);
				
				if(httpMethod.equalsIgnoreCase("POST"))
				{
					res = urlRes.when().post(resourceCall.getResource());
				}
				else
				{
					res = urlRes.when().get(resourceCall.getResource());
				}
			}
			@Then("Validate {string} in the response body is as {string}")
			public void validate_in_the_response_body_is_as(String status, String statusResult) {

				assertEquals(getRequestedString(res,status),statusResult);
			}
	
			@Then("Validate whether the {int} addded is same the id retrieved using {string}")
				public void validate_whether_the_addded_is_same_the_id_retrieved_using(Integer id, String apiResource) throws IOException {
				int reqId = Integer.parseInt(getRequestedString(res, "id"));
				//Response res1 = given().log().all().baseUri("https://petstore.swagger.io").when().get("/v2/pet/{ids}",id).then().log().all().extract().response();
				urlRes = given().spec(requestSpecification()).pathParam("id", reqId);
				the_user_click_the_api_using_method(apiResource,"Get");
				String extractedID = getRequestedString(res, "id").toString();
				
				assertEquals(extractedID,id.toString());
			
				
			}



			@Then("Validate whether all the pet details are retrived which has {string} as {string} using {string}")
				public void validate_whether_all_the_pet_details_are_retrived_which_has_as_using(String status, String value, String apiResource) throws IOException {
				   
				urlRes = given().urlEncodingEnabled(false).spec(requestSpecification()).queryParam("status", value);
				the_user_click_the_api_using_method(apiResource,"Get");
				
				List<String> jsonResponse = res.jsonPath().getList("$"); 
				for(int i = 0;i<jsonResponse.size();i++)
				{
					if(res.jsonPath().getString("name["+i+"]")!=null)
					{
						if(res.jsonPath().getString("name["+i+"]").equalsIgnoreCase("Tiger25"))
						{
							System.out.println(res.jsonPath().getInt("id["+i+"]"));
							//System.out.println(res.jsonPath().getString("name["+i+"]"));
						}						
					}
				}
				
			}

}
