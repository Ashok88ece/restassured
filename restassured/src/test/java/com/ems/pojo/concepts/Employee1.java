package com.ems.pojo.concepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employee1 {
	
	public static void main(String[] args) throws JsonProcessingException {
	
	Employee employee1 = new Employee();
	employee1.setFirstName("Ashok1234");
	employee1.setLastName("kumar1234");
	employee1.setEmail("ashok1234@gmail.com");
	
	System.out.println(employee1.getFirstName());
	System.out.println(employee1.getLastName());

	System.out.println(employee1.getEmail());
	
	//POJO to Serialization
	ObjectMapper mapper = new ObjectMapper();
	
	String employeejson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
	
	System.out.println(employeejson);
	
	System.out.println("JSON Schema Created");

	}
}
