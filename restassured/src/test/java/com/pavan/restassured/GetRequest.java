package com.pavan.restassured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

public class GetRequest {
	
	
	@Test
	public void getpet() {
		
		given()
		.when()
		.get("https://demoqa.com/BookStore/v1/Books")
		.then()
		.statusCode(200)
		
		.statusLine("HTTP/1.1 200 OK")
		.header("Content-Type","application/json; charset=utf-8");
		
	}

}
