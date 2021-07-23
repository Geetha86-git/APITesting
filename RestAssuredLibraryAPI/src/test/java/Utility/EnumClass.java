package Utility;

public enum EnumClass {

	AddBookAPI("/Library/Addbook.php"),
	GetBookAPI("/Library/GetBook.php");
	
	private String resource;

	EnumClass(String resource)
	{
		this.resource = resource;
	}
	
	
	public String getResource() {
		return resource;
	}
}


