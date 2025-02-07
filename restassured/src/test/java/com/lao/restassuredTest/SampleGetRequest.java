package com.lao.restassuredTest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class SampleGetRequest {
	
	@Test
	public void getrequest() {
		
		Response response = RestAssured.get("https://reqres.in/api/users/3");
		
		ResponseBody  responseBody = response.body();
		
		//System.out.println(responseBody.asString());
		
		System.out.println(responseBody.asPrettyString());
		
		
		
	}
	
	@Test 
	public void anothergetrequest() {
		
		
		
		  RestAssured.baseURI="https://reqres.in/api/";
		  
		  ValidatableResponse response = RestAssured .given() .param("", "")
		  .header("","") .when() .get("/users/3") .then() .statusCode(200);
		 
		
		//System.out.println(response.asPrettyString());
	}

}
