package com.lao.restassured;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestAssuredJsonSchemaValidation {
	
@Test	(enabled=false)
	public void validationusingJsonSchemaInClassPath() {
		
		File inputJson = new File("src/test/resources/input.json");
		
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputJson)
	.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}

 @Test
   public void validationUsingJsonSchema() {
	   
	   File inputJson = new File("src/test/resources/input.json");
	   File inputschema = new File("src/test/resources/input.json");
	   
	   RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.header("Content-Type","application/json")
		.body(inputJson)
	.when()
		.post("employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(inputschema));
	   
   }

}
