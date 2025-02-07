package com.lao.restassured;

import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import io.restassured.http.Method;
import org.testng.annotations.Test;

public class Serialization {
	@Test
	public void Serialization() {
		
		Map<String,String> jsonBody = new HashMap<String,String>();
		
		jsonBody.put("first_name", "Daikin");
		jsonBody.put("last_name", "Air");
		jsonBody.put("email", "test@gmail.com");
		
		System.out.println(jsonBody);
		
		given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(jsonBody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();
		
	}
	
	

}
