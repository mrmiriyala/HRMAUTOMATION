package com.Api;
import org.testng.annotations.Test;
//import static org.hamcrest.Matchers.equalTo;

import static org.hamcrest.Matchers.hasItems;


import static io.restassured.RestAssured.given;
public class ListTest1 {
	
	@Test
	public void resource() {
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.log().all()
	    .body("data.name", hasItems("cerulean", "fuchsia rose", "true red"))
	    .body("data.id", hasItems(1,3,5));
	}

	
	}


	

