package resources;

import java.util.ArrayList;
import java.util.List;

import POJOClasses.AddPlace;
import POJOClasses.Location;

public class TestDataBuild {

	public AddPlace addPlacePayload(String name,String address,String language)
	{
		AddPlace add = new AddPlace();
		Location l = new Location();
		
		l.setLat(34.5567);
		l.setLng(35.667);
		add.setAccuracy(50);
		add.setAddress(address);
		add.setLanguage(language);
		add.setName(name);
		add.setPhone_number("99867545");
		add.setWebsite("learners.java.com");
		add.setLocation(l);
		List<String> types = new ArrayList<String>();
		 types.add("sock");
		 types.add("park");	 
		 add.setTypes(types);
		 
		 return add;
	}
	
	public String deletePayload(String placeID)
	{
		return "{\"place_id\":\""+placeID+"\"}";
	}
}
