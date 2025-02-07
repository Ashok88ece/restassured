package com.ems.bdd_style;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class GetAllEmployeesBDD {
	
	@Test (enabled=false)
	//BDD Style Get Request
	public void getAllEmployeesBDD() {
		
		 given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("employees")
		.prettyPrint();
		
	}
	
	@Test 
	//BDD Style POST Request
	public void createAnEmployeeBDD() {
		
		given()
			.baseUri("https://reqres.in/api/")
			.header("Content-Type","application/json")
			.body("{\r\n"
					+ "    \"name\": \"Varman Kumar\",\r\n"
					+ "    \"job\": \"Team lead\"\r\n"
					+ "}")
		.when()
			.post("users")
		.prettyPrint()
		;
		
	}
	
	@Test (enabled=false)
	//BDD Style PUT Request
	public void updateAnEmployeeBDD() {
		
		given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "        \"first_name\": \"Amarnath2\",\r\n"
				+ "        \"last_name\": \"mohan2\",\r\n"
				+ "        \"email\": \"amarnathmohan2@codingthesmartway.com\"\r\n"
				+ "    }")
		.when()
		.put("employees/5")
		.prettyPrint();
	}
	
	@Test (enabled=false)
	//BDD Style Delete Request
	public void deleteAnEmployee() {
		
		given()
		.baseUri("http://localhost:3000/")
		.when()
		.delete("employees/2")
		.prettyPrint();
	}
	
	@Test (enabled=false)
	//Reading JSON from external file
	public void createEmployeefromJSONfile() {
		File jsonFile = new File("postData.json");
		given()
			.baseUri("http://localhost:3000/")
			.header("Content-Type","application/json")
			.body(jsonFile)
		.when()
			.post("employees")
			.prettyPrint();
				
	}

}
