package com.Api;
import static io.restassured.RestAssured.given;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiDouble {

	@Test
	public void user() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/login/?locale=en_GB");
		driver.manage().window().maximize();
		String exp="https://m.facebook.com/login/?locale=en_GB";
		String actual = driver.getCurrentUrl();
		
		Assert.assertTrue(exp.equals(actual));
		 given()
		  .when()
		 .get("https://restful-booker.herokuapp.com/booking/1")
		 .then()
		 .statusCode(200)
		 .log().all();

	}
}
