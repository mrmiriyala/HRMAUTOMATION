package com.Api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class SingleApi {

	@Test
		public void user() {
			
	  given()
	  .when()
	 .get("https://restful-booker.herokuapp.com/booking")
	 .then()
	 .log().all();
	 }
}
