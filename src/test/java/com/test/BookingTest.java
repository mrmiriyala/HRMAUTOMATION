package com.test;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BookingTest {
	@Test(invocationCount=2,invocationTimeOut=30000000)
	public void user() {
  given()
  .when()
 .get("https://restful-booker.herokuapp.com/booking")
 .then()
 .log().all();
 }
}
