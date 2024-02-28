package groups.Api;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
public class FirstUser {
	
	
	@Test()
	public void Firstuser() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://uk.linkedin.com");
		driver.manage().window().maximize();
		String exp="https://uk.linkedin.com/";
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