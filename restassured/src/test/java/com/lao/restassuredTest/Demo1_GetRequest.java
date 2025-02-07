package com.lao.restassuredTest;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class Demo1_GetRequest {
	
@Test
	public void getEmployees() {

		
		given()
		.when()
			.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			//.assertThat().body("",equalTo(""))
			.header("Content-Type","application/json");
		
		
		
	}


		
	}

	



	

