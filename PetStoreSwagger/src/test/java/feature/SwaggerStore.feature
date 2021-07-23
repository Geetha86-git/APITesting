Feature: To Validate the store details in Swagger.io

Scenario Outline: To Validate the the store inventory by status

Given to get the store status using inventory
And to post the pet details using <id> <petId> <quantity> "<shipDate>" "<status>" "<complete>"
When the user calls the "<httpMethod>" method using "<GetAPIDetails>"
And the user calls the "<httpsMethod>" method using "<POSTAPIDetails>"
Then Validate the status code as 200



Examples:
|httpMethod|GetAPIDetails|httpsMethod|POSTAPIDetails|id|petId|quantity|shipDate|status|complete|
|Get|GetInventoryAPI|post|PostPetAPI|0023|00145|1|2021-07-15|placed|true|

Scenario Outline:
Given to get the store status using inventory using <id>
When the user calls the "<httpMethod>" method using "<GetAPIDetails>"
Then Validate the status code as 200

Examples:
|httpMethod|GetAPIDetails|id|
|Get|GetOrderIDAPI|7|