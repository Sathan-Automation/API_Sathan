package RestAssured;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class APIPATCH {

    public static void main(String[] args)
    {
        baseURI = "http://localhost:3000/";
        JSONObject j = new JSONObject();//by using json object we are providing direct json value
//        "email": "sebastian@codingthesmartway.com"
        j.put("email","mannan@gmail.com");

        given().
                contentType(ContentType.JSON).
                when().body(j.toJSONString()).patch
                ("/employees/1").
                then().statusCode(200);
    }


}
