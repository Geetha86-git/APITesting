Feature: To Test Library API

@AddBook
Scenario Outline: To Validate whether able to add a book

Given Add_book to the library using "<name>" "<isbn>" "<aisle>" "<author>"
When The user calls the "POST" method using "AddBookAPI"
Then Verify the "Message" and "ID"

Examples: 
|name				 |isbn|aisle|author|
|The Lan|bih |236  |Kaavya|

@GetBook
Scenario Outline:
Given RetrievBook from the Library using "<author>"
When The user calls the "Get" method using "GetBookAPI"
Then Verify the "book_name"

Examples:
|author|
|Priya|