package com.Api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstUser {
	
	
	@Test(groups = {"sanity","smoke"})
	public void Firstuser() {
		
  given()
  .when()
 .get("https://reqres.in/api/users?page=2")
 .then()
 .statusCode(200)
 .log().all();
}
}