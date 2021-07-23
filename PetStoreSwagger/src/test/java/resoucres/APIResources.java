package resoucres;

public enum APIResources {

	
	GetInventoryAPI("/inventory"),
	PostPetAPI("/order"),
	GetOrderIDAPI("/order/{orderId}");
	
	private String resource;
	
	public String getResource() {
		return resource;
	}

	APIResources(String resource)
	{
		this.resource = resource;
	}
	
}
