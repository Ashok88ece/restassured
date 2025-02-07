package com.ems.bdd_style;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class basicAuth {
	
	@Test
	public  void basicauth() {
		given()
		.auth()
		.basic("postman", "password")
		.baseUri("https://postman-echo.com/")
		.when()
		.get("basic-auth")
		.prettyPrint();
				
	}

}
