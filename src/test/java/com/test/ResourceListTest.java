package com.test;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
public class ResourceListTest {
	
	@Test(invocationCount=3)
	public void resource() {
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("data[0].name", equalTo("cerulean"))
		.body("data[0].year", equalTo(2000))
		.body("data[0].color", equalTo("#98B2D1"))
		.body("data[0].pantone_value", equalTo("15-4020"));
		
		
		
		
		
	}


	}


		










