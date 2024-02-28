package com.All;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstUser {
	
	
	@Test(alwaysRun=true)
	public void Firstuser() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/login/?locale=en_GB");
		driver.manage().window().maximize();
		String exp="https://m.facebook.com/login/?locale=en";
		String actual = driver.getCurrentUrl();
		Assert.assertFalse(exp.equals(actual));
		
  given()
  .when()
 .get("https://reqres.in/api/users?page=2")
 .then()
 .statusCode(200)
 .log().all();
}
	@Test(priority=1)
	public void seconduser()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://m.facebook.com/login/?locale=en_GB");
		driver.manage().window().maximize();
		String exp="https://m.facebook.com/login/?locale=en";
		String actual = driver.getCurrentUrl();
		Assert.assertFalse(exp.equals(actual));
		
  given()
  .when()
 .get("https://reqres.in/api/users?page=2")
 .then()
 .statusCode(200)
 .log().all();	
	}
}