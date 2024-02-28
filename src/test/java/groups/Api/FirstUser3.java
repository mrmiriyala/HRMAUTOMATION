package groups.Api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstUser3 {
	
	@Test(enabled=false)
	public void Firstuser3() {
		
  given()
  .when()
 .get("https://reqres.in/api/unknown")
 .then()
 .statusCode(200)
 .log().all();
}
}
