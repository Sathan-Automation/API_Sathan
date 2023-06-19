package RestAssured;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;



public class APIPOST {

    public static void main(String[] args) {

//        given().
//                baseUri("http://localhost:3000").
//                contentType(ContentType.JSON).
//                accept(ContentType.JSON).
//                body("{\n" +
//                        "    \"first_name\": \"dummy12\",\n" +
//                        "    \"last_name\": \"Anushka\",\n" +
//                        "    \"email\": \"kohli@codingthesmartway.com\"\n" +
//                        "  \n" +
//                        "}").
//                when().
//                post("/employees").
//                then().
//                statusCode(201).
//                log().all();

        given().contentType(ContentType.JSON).accept(ContentType.JSON).
                body("{\n" +
                        "  \"id\": 0,\n" +
                        "  \"username\": \"sathan\",\n" +
                        "  \"firstName\": \"velmurugan\",\n" +
                        "  \"lastName\": \"palpandi\",\n" +
                        "  \"email\": \"psk@gmail.com\",\n" +
                        "  \"password\": \"test@123\",\n" +
                        "  \"phone\": \"8152415412\",\n" +
                        "  \"userStatus\": 1\n" +
                        "}").when().post("https://petstore.swagger.io/v2/user").then().statusCode(200).log().all();

    }


//        JSONObject r = new JSONObject();
//        r.put("first_name","VelMurugan");
//        r.put("last_name","Shanmugan");
//        r.put("email","kantha@codingthesmartway.com");
//
//        baseURI = "http://localhost:3000/";
//        given().
//                contentType(ContentType.JSON).
//                accept(ContentType.JSON).
//                body(r.toJSONString()).
//                when().post("/employees").
//                then().statusCode(201).log().all();



//
//              given().contentType(ContentType.JSON).accept(ContentType.JSON).
//            body("{\n" +
//                    "  \"id\": 0,\n" +
//                    "  \"username\": \"sathan\",\n" +
//                    "  \"firstName\": \"kanthan\",\n" +
//                    "  \"lastName\": \"palpandi\",\n" +
//                    "  \"email\": \"gayu@gmail.com\",\n" +
//                    "  \"password\": \"test@123\",\n" +
//                    "  \"phone\": \"8152415412\",\n" +
//                    "  \"userStatus\": 1\n" +
//                    "}").when().put("https://petstore.swagger.io/v2/user/sathan").then().statusCode(200).log().all();

//    given().when().delete("https://petstore.swagger.io/v2/user/sathan").then().statusCode(200).log().all();

    }
//}
