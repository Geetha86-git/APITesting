package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		if(StepFile.placeID==null)
		{
			StepFile sf = new StepFile();
			sf.add_place_payload_with("Geetha", "DGL", "Eng");
			sf.user_calls_with_post_http_request("AddPlaceAPI", "POST");
			sf.verify_place_id_is_obtained_correctly_for_as_passed_under("Geetha", "GetPlaceAPI");
		}
	}
}
