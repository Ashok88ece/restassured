package com.lao.restassuredTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateBook {
	@Test
	public void createbook() {
		
		RestAssured.baseURI="https://reqbin.com/echo/post";
		
		RequestSpecification requestspecification= RestAssured
				.given()
				.body("{\r\n"
						+ "  \"Id\": 78912,\r\n"
						+ "  \"Customer\": \"Jason Sweet\",\r\n"
						+ "  \"Quantity\": 1,\r\n"
						+ "  \"Price\": 18.00}");
		
		Response response = requestspecification.request(Method.POST,"/json");
		
		//System.out.println(response.getStatusLine());
		//System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		//System.out.println(response.asString());
	}

}
