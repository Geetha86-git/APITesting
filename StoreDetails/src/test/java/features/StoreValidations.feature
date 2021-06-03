Feature: To Validate PET Store APIs

Scenario Outline: Verify whether able to add a new pet to the Store

Given add_New_Pet to the store with "<name>" <id> 
When the user click the "AddPetAPI" API using "POST" method
Then Validate "status" in the response body is as "available"
And Validate whether the <id> addded is same the id retrieved using "GetPetAPIByID"
And Validate whether all the pet details are retrived which has "status" as "available" using "GetPetAPI" 

Examples:
|name|id|
#|Jacky|1|
|Tiger25|285|
