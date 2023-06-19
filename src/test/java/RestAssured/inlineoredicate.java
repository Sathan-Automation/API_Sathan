package RestAssured;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class inlineoredicate {

    public static void expression() throws IOException {
        File file = new File("C:/Users/satha/OneDrive/Desktop/book.json");
        DocumentContext context = JsonPath.parse(file);
        // predicate means expression for example to find the price greater than 10 in the above file $.store.book.[?(@.price<10)]
        List<Object> prices = context.read("$.store.book.[?(@.price<10)]");
        for (Object price:prices) {
            System.out.println(price);
        }
    }
    public static void main(String[] args) throws IOException {

        expression();



//
    }
}
