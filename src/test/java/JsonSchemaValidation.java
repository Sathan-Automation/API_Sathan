import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JsonSchemaValidation {

    public static void main(String[] args) {
        File input = new File("C:/Users/satha/OneDrive/Desktop/Input.json");
        File schema = new File("C:/Users/satha/OneDrive/Desktop/Schema.json");
        RestAssured.given().
                baseUri("http://localhost:3000").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(input).
                when().
                post("/employees").
                then().
                body(JsonSchemaValidator.matchesJsonSchema(schema)).log().all();
    }
}
