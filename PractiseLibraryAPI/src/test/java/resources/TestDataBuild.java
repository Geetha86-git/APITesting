package resources;

public class TestDataBuild{

	AddBook add = new AddBook();
	public AddBook addBook(String name,String isbn,String aisle,String author)
	{		
		add.setName(name);
		add.setIsbn(isbn);
		add.setAisle(aisle);
		add.setAuthor(author);
		
		return add;
	}	
	
	public String deleteBook(String id)
	{
		return "{\"ID\":\""+id+"\"}";
	}
	
	public DeleteBook delBook(String ID) {
		DeleteBook del = new DeleteBook();
		del.setID(ID);
		return del;
	}
}
