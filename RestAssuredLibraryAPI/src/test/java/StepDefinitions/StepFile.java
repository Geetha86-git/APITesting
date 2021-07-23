package StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import Utility.AddBook;
import Utility.CoreUtils;
import Utility.EnumClass;
import Utility.TestDataBuild;

public class StepFile extends CoreUtils{
	
	RequestSpecification url;
	TestDataBuild data = new TestDataBuild();
	Response res;
	
	
	@Given("Add_book to the library using {string} {string} {string} {string}")
	public void add_book_to_the_library_using(String name, String isbn, String aisle, String author) throws IOException {
		url = given().spec(requestSpecification()).body(data.addBook(name, isbn, aisle, author));
	}
	@When("The user calls the {string} method using {string}")
	public void the_user_calls_the_method_using(String httpMethod, String requestAPI) {
		
		EnumClass resource = EnumClass.valueOf(requestAPI);
		
		if(httpMethod.equalsIgnoreCase("POST"))
		{
			res = url.when().post(resource.getResource());
		}
		else
		{
			res = url.when().get(resource.getResource());
		}
	}
	@Then("Verify the {string} and {string}")
	public void verify_the_and(String Msg, String ID) {
	    
		AddBook add = new AddBook();
		String id = add.getIsbn()+add.getAisle();
		if(jsonValidation(res, ID).equalsIgnoreCase(id))
		{
			assertEquals(jsonValidation(res, Msg),"Successfully added");
		}
	}

	@Given("RetrievBook from the Library using {string}")
	public void retriev_book_from_the_library_using(String authorName) throws IOException {
	    url = given().spec(requestSpecification()).queryParam("AuthorName", authorName);
	    the_user_calls_the_method_using("GET", "GetBookAPI");
	}
	@Then("Verify the {string}")
	public void verify_the_as(String name) {
		
		List<String> bookList = res.jsonPath().getList("$");
		for(int i = 0;i<bookList.size();i++)
		{
			if(res.jsonPath().getString(name+"["+i+"]")!=null) {
				if(res.jsonPath().getString(name+"["+i+"]").equalsIgnoreCase("The Air"))
				{
					System.out.println("true");
				}
			}
		}
		//assertEquals(jsonValidation(res,name),"The Air");
		
	}




	
}
