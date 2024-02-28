package com.Api;
import org.testng.annotations.Test; 
import static io.restassured.RestAssured.given;
public class SingleTest {
	
	

		@Test
			public void user() {
				
		  given()
		  .when()
		 .get("https://reqres.in/api/users/2")
		 .then()
		 .log().all();
}
}
