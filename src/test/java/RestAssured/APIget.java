package RestAssured;

import static io.restassured.RestAssured.given;


public class APIget {

    public  static  void main(String[] args)
    {

        given().
                baseUri( "http://localhost:3000").
                when().
                get("/employees").
                then().
                statusCode(200).
                log().all();
    }
}
