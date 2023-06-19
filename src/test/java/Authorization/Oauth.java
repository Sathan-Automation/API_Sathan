package Authorization;

import static io.restassured.RestAssured.given;

public class Oauth {

    public static void Oauth2()
    {
        given().auth().oauth2("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").
                when().get("https://api.github.com/user/repos").
                then().log().all();


    }

    public static void main(String[] args) {
        Oauth2();
    }
}
