package Authorization;

import static io.restassured.RestAssured.given;

public class APIkey {

    public static void apikey()
    {
        given().
                queryParam("q","Mumbai").
                queryParam("appid","91b3ad09c80500c6a7888cc474fb65fd").
                when().get("https://api.openweathermap.org/data/2.5/weather").
                then().log().all();


    }

    public static void main(String[] args) {
        apikey();
    }
}
