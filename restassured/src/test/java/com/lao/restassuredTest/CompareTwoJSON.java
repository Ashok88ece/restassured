package com.lao.restassuredTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.mapper.ObjectMapper.*;

public class CompareTwoJSON {
	
	
	static String json1 = "{\r\n"
						+ "       \r\n"
						+ "        \"first_name\": \"Praveen\",\r\n"
						+ "        \"last_name\": \"Kumar\",\r\n"
						+ "        \"email\": \"praveenkumar@codingthesmartway.com\"\r\n"
						+ "    }";
	
	static String json2 = "{\r\n"
						+ "       \r\n"
						+ "        \"first_name\": \"Praveen\",\r\n"
						+ "        \"last_name\": \"Kumar\",\r\n"
						+ "        \"email\": \"praveenkumar@codingthesmartway.com\"\r\n"
						+ "    }";
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		//ObjectMapper mapper = new ObjectMapper();
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode jsonNode1 = mapper.readTree(json1);
		
		JsonNode jsonNode2 = mapper.readTree(json2);
		
		System.out.println(jsonNode1.equals(jsonNode2));
		
		
	}

}
