package com.lao.restassuredTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

public class SimplePostRequest {
	
	@Test
	public void PostRequest() {
		
JSONObject jsonobject = new JSONObject();
		
		jsonobject.put("Name", "Kumar");
		jsonobject.put("JOB", "Team Lead");
		
		System.out.println(jsonobject.toString());
		RestAssured.baseURI="https://reqres.in";
		
		 RestAssured
		.given()
		.header("","")
		.body(jsonobject.toJSONString())
		.post("api/users")
		.then()
		  .statusCode(201);
		

		//System.out.println(response);
		
		
	}

}
