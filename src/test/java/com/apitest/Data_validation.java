package com.apitest;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_validation {
	@Test
	public void data_validation() {
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification request = RestAssured.given();
	Response response = request.get("/api/users?page=2");
	String responseoutput = response.asString();
	System.out.println(responseoutput);
	int statusCode = response.getStatusCode();
	System.out.println(statusCode);
	Assert.assertEquals(200, statusCode);
	System.out.println("Validation Successful");
	}
}
