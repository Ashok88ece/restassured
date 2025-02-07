package com.lao.restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	@Test 
	public void getallemployeees() {

//Get Request
		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given();

		Response response = requestSpecification.request(Method.GET,"employees");

		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusCode());

		System.out.println(response.getStatusLine());

	}

	//Post Request
	@Test (enabled=false)
	public void createEmployee() {

		RestAssured.baseURI="http://localhost:3000/";

		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-type","application/json")
				.body("{\r\n"
						+ "       \r\n"
						+ "        \"first_name\": \"Praveen\",\r\n"
						+ "        \"last_name\": \"Kumar\",\r\n"
						+ "        \"email\": \"praveenkumar@codingthesmartway.com\"\r\n"
						+ "    }");

		Response response =	 requestSpecification.request(Method.POST,"employees");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.getStatusLine());
		
		System.out.println(response.getStatusCode());


	}
	
	//Put Request
	@Test (enabled=false)
	public void updateanEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification requestSpecification =  RestAssured
		.given()
		.header("Content-type","application/json")
		.body("{\r\n"
				+ "		       \r\n"
				+ "	        \"first_name\": \"Dilip\",\r\n"
				+ "	        \"last_name\": \"mohan\",\r\n"
				+ "	        \"email\": \"dilipmohan@codingthesmartway.com\"\r\n"
				+ "	    }");
		
		Response response =  requestSpecification.request(Method.PUT,"employees/5");
		
		System.out.println(response.getStatusCode());
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.statusLine());
	}
	
	//Delete Request
	@Test (enabled=false)
	public void deleteanEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.DELETE,"employees/6");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.statusLine());
	}
	
	//Get A single request
	@Test (enabled=false)
	public void getEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.GET,"employees/1");
		
		System.out.println(response.asPrettyString());
		
		System.out.println(response.statusLine());
	}
	
	
}


