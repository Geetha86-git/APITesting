package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class TestDataBuild extends Coreutils{

	AddPet add = new AddPet();
	public AddPet addPet() throws IOException {
				
		int id = Integer.parseInt(getResources("id"));
		int petId = Integer.parseInt(getResources("petId"));
		int quantity = Integer.parseInt(getResources("quantity"));
		
		add.setId(id);
		add.setPetId(petId);
		add.setQuantity(quantity);
		add.setShipDate(getResources("shipDate"));
		add.setStatus(getResources("status"));
		add.setComplete(getResources("complete"));
		return add;
	}
	
	public AddPet addPetfromExcel() throws FileNotFoundException
	{
			ExternalTestData data = new ExternalTestData();	
		//LinkedList list = data.addPetToStore("Add pet to store","Sheet1");
			LinkedList list = data.addPetNewMethd();
				
			add.setId(Integer.parseInt((String) list.get(1)));
			add.setPetId(Integer.parseInt((String) list.get(2)));
			add.setQuantity(Integer.parseInt((String) list.get(3)));
			add.setShipDate((String)list.get(4));
			add.setStatus((String)list.get(5));
			add.setComplete((String)list.get(6));
			
			return add;
	}
	

}
