Feature: Validate AddPlace API's
@AddPlace
Scenario Outline: Validating the place is being added successfully with POST request
Given Add Place Payload with "<name>" "<language>" "<address>"
When User calls "addPlaceAPI" with "POST" http request
Then the API call got succcess with status code 200
And verify if "status" in response body is "OK"
And verify if "scope" in response body is "APP"
And verify place_Id created maps to "<name>" using "getPlaceAPI"

Examples:
    |name   |language|address|
    |AAhouse|English |World Cross Centre|
    #|BBHouse|Spanish |Sea Cross Centre   |
    
@DeletePlace
Scenario: Verify if deletePlace functionality is working
Given deletePlace Payload
When User calls "deletePlaceAPI" with "POST" http request
Then the API call got succcess with status code 200
And verify if "status" in response body is "OK"
    