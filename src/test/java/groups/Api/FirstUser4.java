package groups.Api;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;
public class FirstUser4 {
	
	@Test()
	public void Firstuser4() 
	
	{

HashMap<String,String> hm= new HashMap<String,String>();
hm.put("RaviMiriyala","Software");
  given()
  .body(hm)
  .when()
 .post("https://reqres.in/api/users")
 .then()
 .statusCode(201)
 .log().all();
}

	
	}

