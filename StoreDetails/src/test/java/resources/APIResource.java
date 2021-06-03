package resources;

public enum APIResource {

	AddPetAPI("/v2/pet"),
	GetPetAPIByID("/v2/pet/{id}"),
	GetPetAPI("/v2/pet/findByStatus");
		
	private String resource;
	
	APIResource(String resource) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
	}
	
	public String getResource() {
		return resource;
	}
	
}
