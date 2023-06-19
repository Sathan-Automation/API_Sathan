package RestAssured;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;


public class APIDelete {

    public static void main(String[] args)
    {
        baseURI = "http://localhost:3000/";
        when().delete("/employees").then().statusCode(200);
    }
}
