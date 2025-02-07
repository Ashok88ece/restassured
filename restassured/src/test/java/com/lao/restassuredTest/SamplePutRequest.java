package com.lao.restassuredTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SamplePutRequest {
	
	@Test
	public void putrequestexample() {
		
		JSONObject jsonobject = new JSONObject();
		
		jsonobject.put("name", "morpheus");
		
		jsonobject.put("job", "leader");
		
		
		RestAssured.baseURI="https://reqres.in";
		
		RestAssured
		.given()
		.when()
		.body(jsonobject.toJSONString())
		.patch("api/users/2")
		.then()
		.statusCode(200);
		
	}
	
	@Test
	
	public void deleterequest() {
		
		RestAssured.baseURI="https://reqres.in";
		
		RestAssured
		.given()
		.when()
		.delete("api/users/2")
		.then()
		.statusCode(204);
	}
	

}
