package RestAssured;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.IOException;

public class Writingfile {

    public static void write() throws IOException {
        File file = new File("C:/Users/satha/OneDrive/Desktop/book.json");
        DocumentContext context = JsonPath.parse(file);

    }
}


