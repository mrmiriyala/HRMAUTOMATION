package groups.Api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstUser2 {
	
	@Test()
	public void Firstuser2() {
		
  given()
  .when()
 .get("https://reqres.in/api/users/23")
 .then()
 .statusCode(404)
 .log().all();
}
}