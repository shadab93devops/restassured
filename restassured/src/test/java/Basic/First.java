package Basic;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
public class First {
int id;
	@Test
	void login() {
		System.out.println("login");
	}
	
	
	
	@Test
	void setup() {
		System.out.println("setup");
	}
	
	@Test
	void getuser() {
	
		given()
		
		.when().get("https://reqres.in/api/users/2")
		.then().log().all().statusCode(200);
	}
	
	
	@Test(priority=0)
	void createuser() {
		id=given().log().all().header("content/type","application.json")
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.when()
		.post("https://reqres.in/api/users").jsonPath().getInt("id");
		
	}
	
	

	  @Test (priority=1,dependsOnMethods = { "createuser" })
	
	void updateuser() {
		given().body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		
		.when()
		.put("https://reqres.in/api/users"+id)
		
		.then().log().all().statusCode(201);
	}
}

	
	
	