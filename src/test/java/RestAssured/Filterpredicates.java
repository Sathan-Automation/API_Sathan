package RestAssured;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Filterpredicates {


    public static void filterpredic() throws IOException {
        File file = new File("C:/Users/satha/OneDrive/Desktop/book.json");
        DocumentContext context = JsonPath.parse(file);

        Filter  pricelessthan10= Filter.filter(Criteria.where("price").lt(10));
        List<Map<String,Object>> prices= context.read("$.store.book[?]",pricelessthan10);

        for(Object price:prices)
        {
            System.out.println(price);
        }
    }

    public static void main(String[] args) throws IOException {
        filterpredic();
    }
}
