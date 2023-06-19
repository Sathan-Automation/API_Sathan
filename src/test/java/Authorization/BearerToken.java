package Authorization;

import static io.restassured.RestAssured.given;

public class BearerToken {

    //Bearer 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

    public static void bearertoken()
    {
        given().
              header("Authorization","Bearer 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").
                when().get("https://api.github.com/user/repos").
                then().log().all();


    }

    public static void main(String[] args) {
        bearertoken();
    }
}
