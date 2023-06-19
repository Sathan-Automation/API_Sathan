package RestAssured;

import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;


public class APITesting {

    public static void main(String[] args)
    {

        Response res = get("http://localhost:3000/employees");
        System.out.println("status code is "+res.getStatusCode());
        Assert.assertEquals(res.getStatusCode(),200);
        System.out.println("Status body is  "+res.getBody().asPrettyString());
        System.out.println("Status line is  "+res.getStatusLine());



    }
}
