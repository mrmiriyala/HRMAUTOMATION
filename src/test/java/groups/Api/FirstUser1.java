package groups.Api;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class FirstUser1 {
	
	@Test(enabled=false)
	public void Firstuser1() {
		
  given()
  .when()
 .get("https://reqres.in/api/users/2")
 .then()
 .statusCode(200)
 .log().all();
}
}