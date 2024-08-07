package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.AddPlacePojo;
import pojo.Location;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class MainSteps extends Utils {
	
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	static String place_id;
	 TestDataBuild data=new TestDataBuild();
	
	@Given("Add Place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println("AddPlace Payload");
		
		
	res=given().spec(requestSpecification()).body(data.addPlacePayload(name,language,address));		
		
	}
	@When("User calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	    // Write code here that turns the phrase above into concrete actions
		resspec=new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		APIResources resourceAPI=APIResources.valueOf(resource);
		
		if(method.equalsIgnoreCase("POST"))
		response=res.when().post(resourceAPI.getResource());
		else if(method.equalsIgnoreCase("GET"))
			response=res.when().get(resourceAPI.getResource());
			
	}
	@Then("the API call got succcess with status code {int}")
	public void the_api_call_got_succcess_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(response.getStatusCode(),200);
	}
	@Then("verify if {string} in response body is {string}")
	public void verify_if_in_response_body_is(String key, String value) {
	    // Write code here that turns the phrase above into concrete actions
	   assertEquals(getJsonPath(response, key),value);
	}
	
	@Then("verify place_Id created maps to {string} using {string}")
	public void verify_place_id_created_maps_to_using(String expectedName, String resource) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    place_id=getJsonPath(response, "place_id");
	    res=given().spec(requestSpecification()).queryParam("place_id", place_id);
	    user_calls_with_http_request(resource, "GET");
	    String actualName=getJsonPath(response, "name");
	    assertEquals(actualName,expectedName);
	}
	
	
	@Given("deletePlace Payload")
	public void delete_place_payload() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    res=given().spec(requestSpecification()).body(data.deletePlacePayload(place_id));
	    
	}
}
