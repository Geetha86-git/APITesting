Feature: Validating Place API's

@AddPlace
Scenario Outline: Verify if place is added successfully using ADDPlaceAPI

	Given Add_Place_payload with "<name>" "<address>" "<language>"	
	When user calls "AddPlaceAPI" with "Post" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"
	And "scope" in response body is "APP"
	And verify place_id is obtained correctly for "<name>" as passed under "GetPlaceAPI"
	
Examples:
		
		|name   |address 			|language			|
		|Saran	|Coimbatore		|Tamil				|
	#	|Kaavya	|CBE					|English			|
	
	@DeletePlace
	Scenario:
	Given Delete_Place_payload with "place_id"
	When user calls "DeletePlaceAPI" with "Post" http request
	Then the API call got success with status code 200
	And "status" in response body is "OK"