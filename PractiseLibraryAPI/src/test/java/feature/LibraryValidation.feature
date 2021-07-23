Feature: To Validate the Library API

@AddBook
Scenario Outline: To Add_Book in a Library

Given add a book in the library using "<name>" "<isbn>" "<aisle>" "<author>"
When the user calls a "POST" method using "AddBookAPI"
Then verify the result body by validating the tags "<isbn>" and "<aisle>"

Examples:

|name|isbn|aisle|author|
|The Ar|aan|019|Priya|

@GetBook
Scenario Outline:
Given get book details in the library using "AuthorName" and "<author>"
#And  get book details in the library using "ID" and "<id>"
When the user calls a "GET" method using "GetBookAPI"
Then verify the result body by validating the book name "book_name"

Examples:

|author|id|
|Max|3389|


@DeleteBook
Scenario:
Given delete the book using "id"
When the user calls a "POST" method using "DeleteBookAPI"
Then verify the result body by validating the "msg"