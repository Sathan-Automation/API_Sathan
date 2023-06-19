package RestAssured;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ReadingJsonFilewithJaywayjasonpath {


    public static void readfile() throws IOException {
        InputStream jsonfile = new FileInputStream("C:/Users/satha/OneDrive/Desktop/book.json");
         Object parsedfile = Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());
        List<Object> Titles = JsonPath.read(parsedfile ,"$..title");
        for (Object Title:Titles) {

            System.out.println("Title is  "+Title);
        }

    }
  public static void fluent_api() throws IOException {
      File file = new File("C:/Users/satha/OneDrive/Desktop/book.json");
      DocumentContext context = JsonPath.parse(file);
      List<Object> Titles = context.read("$..title");
      for (Object Title:Titles) {

          System.out.println("Title is  "+Title);
      }
  }
    public static void main(String[] args) throws IOException {

        readfile();
        fluent_api();
    }

}
