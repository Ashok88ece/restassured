package com.lao.restassured;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestJsonShemaValidator {
	
	@Test
	public void validate() throws IOException { 
		
		File inputJson = new File("src/test/resources/input.json");
		
		String Jsoncontent = FileUtils.readFileToString(inputJson,"UTF-8");
		
		
		File schemaJson = new File("src/test/resources/schema.json");
		
		MatcherAssert.assertThat(Jsoncontent, JsonSchemaValidator.matchesJsonSchema(schemaJson));
	}

}
