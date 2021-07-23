package Utility;

public class TestDataBuild {
	
	
	public AddBook addBook(String name,String isbn,String aisle,String author)
	{
		AddBook add = new AddBook();
		add.setName(name);
		add.setIsbn(isbn);
		add.setAisle(aisle);
		add.setAuthor(author);
		return add;				
	}
}
