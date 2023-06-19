package Authorization;

import static io.restassured.RestAssured.given;

public class BasicAuth {

 public static void basicauth()
    {
        given().
                baseUri("https://postman-echo.com/").
                auth().basic("postman","password").when().
                get("basic-auth").prettyPrint();
    }

    public static void main(String[] args) {
        basicauth();
    }
}
