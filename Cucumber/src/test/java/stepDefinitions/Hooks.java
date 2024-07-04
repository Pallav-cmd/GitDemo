package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
	
	//Execute this code only when place id is null
	//Write a code that will give you place id
	
	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		MainSteps m=new MainSteps();
		if(MainSteps.place_id==null)
		{
			m.add_place_payload_with("Shetty", "French", "England");
			m.user_calls_with_http_request("addPlaceAPI", "POST");
			m.verify_place_id_created_maps_to_using("Shetty", "getPlaceAPI");
		}
		
	}

}
