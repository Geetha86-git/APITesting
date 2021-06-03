package resources;
import java.util.ArrayList;
import java.util.List;

import POJOClasses.*;

public class Testdatabuild {
	
		public Addnewpet addPet(String name,Integer id)
		{
			Addnewpet add = new Addnewpet();
			Category cate = new Category();
			Tags tag = new Tags();
			
			add.setId(id);
			add.setName(name);
			ArrayList<String> photos = new ArrayList<String>();
			photos.add("image");
			add.setPhotoUrls(photos);
			add.setStatus("available");
			cate.setId(10);
			cate.setName("Kombai");
			add.setCategory(cate);
			
			tag.setId(10);
			tag.setName("Kombai");
			
			ArrayList<Tags> tag1 = new ArrayList<Tags>();
			tag1.add(tag);
			
			add.setTags(tag1);
			
			return add;
		}

}
