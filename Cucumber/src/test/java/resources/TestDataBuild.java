package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlacePojo;
import pojo.Location;

public class TestDataBuild {

	public AddPlacePojo addPlacePayload(String name, String language, String address)
	{
AddPlacePojo a=new AddPlacePojo();
		
		a.setAccuracy(50);
		a.setName(name);
		a.setPhone_number("(+91) 983 893 3937");
		a.setAddress(address);
		a.setWebsite("http://google.com");
		a.setLanguage(language);
		
		List<String> myList=new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		a.setTypes(myList);
		
		
		Location l=new Location();
		
		l.setLat(-38.383494);
		l.setLng(33.427362);
		
		a.setLocation(l);
		return a;
	}
	
	public String deletePlacePayload(String placeId)
	{
		return "{\r\n"
				+ "\"place_id\":\""+placeId+"\"\r\n"
				+ "}";
	}
}
