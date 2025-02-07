package com.lao.restassuredTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Get Google URL & Get Status Code
		
		Response response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
		
		int statuscode = response.getStatusCode();
		
		System.out.println("WebService Response Code:"+statuscode);
		
		String statusline = response.getStatusLine();
		
		System.out.println("Get Method Response:"+ statusline);
		
		String PrettyPrint = response.prettyPrint();
		
		//System.out.println("API Print:"+PrettyPrint);
		
		String ContentType = response.contentType();
		
		System.out.println("API Content Type:"+ContentType);

	}

}
