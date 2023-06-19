package RestAssured.Pojo;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class FirstEmployee {

    public static void main(String[] args) throws JsonProcessingException {
        Employee e = new Employee();
        e.setFirst_name("surya");
        e.setLast_name("sivakumar");
        e.setEmail("surya@gmail.com");
        e.setSkills(Arrays.asList("Java","cucumber"));


        ObjectMapper o = new ObjectMapper();
        String empjson = o.writerWithDefaultPrettyPrinter().writeValueAsString(e);

        System.out.println(empjson);
    }
}
