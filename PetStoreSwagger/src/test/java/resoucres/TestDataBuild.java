package resoucres;

public class TestDataBuild {

	public AddPet addPet(int id,int petId,int quantity,String shipDate,String status,String complete)
	{
		AddPet add = new AddPet();
		add.setId(id);
		add.setPetId(petId);
		add.setQuantity(quantity);
		add.setShipDate(shipDate);
		add.setStatus(status);
		add.setComplete(complete);
		return add;
	}
	
	
}
