package resources;

public enum APIResources {

	AddBookAPI("/Library/Addbook.php"),
	GetBookAPI("/Library/GetBook.php"),
	DeleteBookAPI("/Library/DeleteBook.php");

	private String resource;
	
	public String getResource() {
		return resource;
	}

	APIResources(String resource)
	{
		this.resource = resource;
	}
	
	
}
