package RestAssured;

import io.restassured.http.ContentType;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class APISerialization {

    @Test
    public void serialization()
    {
        Map<String,Object> employee= new HashMap<>();

        employee.put( "first_name","Ajith");
        employee.put("last_name","Vijay");
        employee.put("email","viji@gmail.com");

        List<String>Skill = new ArrayList<>();
        Skill.add("java");
        Skill.add("selenium");

        employee.put("Skills",Skill);//employee is a java object containing employee values

        given()
                .baseUri("http://localhost:3000").
                header("Content-Type","application/json").
                body(employee).
                when().
                post("/employees").
                prettyPrint();

    }

}
