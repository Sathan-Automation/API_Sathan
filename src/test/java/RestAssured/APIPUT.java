package RestAssured;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

public class APIPUT {


    public static void main(String[] args)
    {
        given().baseUri("http://localhost:3000").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body("{\n" +
                        "    \"email\": \"kohli123@codingthesmartway.com\"\n" +
                        "  \n" +
                        "}").
                when().
                put("/employees/34").
                then().statusCode(200).log().body();
    }
}
