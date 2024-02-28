package groups.Api;

import static io.restassured.RestAssured.given;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APIrestassured {

	
	@Test()
	public void PostRequest() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		String exp="https://www.linkedin.com/";
		String actual = driver.getCurrentUrl();
		SoftAssert sf=new SoftAssert();
		sf.assertTrue(exp.equals(actual));
  given()
  .when()
 .get("https://reqres.in/api/users?page=2")
 .then()
 .statusCode(200)
 .log().all();
}

}
