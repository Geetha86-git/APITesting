package stepdefinition;

import io.cucumber.java.en.*;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.*;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

public class StepFile extends Coreutils{
	
	RequestSpecification req;
	TestDataBuild data = new TestDataBuild();
	Response res;
	
	@Given("add a book in the library using {string} {string} {string} {string}")
	public void add_a_book_in_the_library_using(String name, String isbn, String aisle, String author) throws IOException {
		
		req=given().spec(requestSpecificationToMerge()).body(data.addBook(name, isbn, aisle, author));
	   
	}
	@When("the user calls a {string} method using {string}")
	public void the_user_calls_a_method_using(String httpMethod, String API) {
		
		APIResources api = APIResources.valueOf(API);
		if(httpMethod.equalsIgnoreCase("POST"))
		{
			res = req.when().post(api.getResource());
		}
		else
		{
			res = req.when().get(api.getResource());
		}
	}
	@Then("verify the result body by validating the tags {string} and {string}")
	public void verify_the_result_body_by_validating_the_tags_and(String isbn, String aisle) {
	   
		String id = isbn+aisle;
		if(id.equalsIgnoreCase(jsonValidation(res,"ID")))
		{
			assertEquals(jsonValidation(res,"Msg"),"successfully added");
		}
		else
		{
			assertEquals(jsonValidation(res,"Msg"),"successfully added");
		}
	}
	
	/*@Given("get book details in the library using {string} and {string}")
	public void get_book_details_in_the_library_using(String name,String searchText) throws IOException {
	    
		req = given().spec(requestSpecificationToMerge()).queryParam(name,searchText);
		the_user_calls_a_method_using("Get", "GetBookAPI");
	}
	@Then("verify the result body by validating the book name {string}")
	public void verify_the_result_body_by_validating_the_book_name(String name) {
	    List<String> bookList = res.jsonPath().getList("$");
	
	  for(int i =0;i<bookList.size();i++)
	  {
		  if(res.jsonPath().getString(name+"["+i+"]")!=null) {
			  
			  if(res.jsonPath().getString("book_name"+"["+i+"]").equalsIgnoreCase("The Air"))
			  {
				System.out.println("true");  
			  }
		  }
	   }
	}*/
	@Given("get book details in the library using {string} and {string}")
	public void get_book_details_in_the_library_using(String name,String searchText) throws IOException {
	    
		GetBook[] gc = given().spec(requestSpecificationToMerge()).queryParam(name,searchText)
		.when().get("/Library/GetBook.php").as(GetBook[].class);
		
	
		for(int i=0;i<gc.length;i++)
		{
			System.out.println(gc[i].getBook_name());
			System.out.println(gc[i].getIsbn());
		}
		
		//System.out.println(gc.getGetBook().get(0).getBook_name());
	}
	/*@Then("verify the result body by validating the book name {string}")
	public void verify_the_result_body_by_validating_the_book_name(String name) {
	   // List<String> bookList = res.jsonPath().getList("$");
				
	  /*for(int i =0;i<bookList.size();i++)
	  {
		  if(res.jsonPath().getString(name+"["+i+"]")!=null) {
			  
			  if(res.jsonPath().getString("book_name"+"["+i+"]").equalsIgnoreCase("The Air"))
			  {
				System.out.println("true");  
			  }
		  }
	   }
	    
	}*/	
	
	@Given("delete the book using {string}")
	public void delete_the_book_using(String string) throws IOException {
	   
		req = given().spec(requestSpecificationToMerge()).body(data.deleteBook("aaj009"));
		the_user_calls_a_method_using("post", "DeleteBookAPI");
			
	}
	@Then("verify the result body by validating the {string}")
	public void verify_the_result_body_by_validating_the(String msg) {
	   
		assertEquals(jsonValidation(res,msg),"book is successfully deleted");
	}

}
