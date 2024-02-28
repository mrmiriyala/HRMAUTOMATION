package com.test;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
public class BookingTest1 {
	
	@Test(invocationCount=2,invocationTimeOut=4000000)
	public void user()
	{
		given()
		.when()
		.get("https://restful-booker.herokuapp.com/booking/1")
		.then()
		.log().all();
	}
}
