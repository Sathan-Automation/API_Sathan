package RestAssured;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class ReadingJsonfile {

    public static void main(String[] args) throws IOException, ParseException {

        JSONParser parser = new JSONParser();
        FileReader fis = new FileReader("C:/Users/satha/OneDrive/Desktop/book.json");
        Object obj = parser.parse(fis);
        JSONObject jsonObject = (JSONObject)obj;
        Object obj1 = jsonObject.get("store");
        JSONObject jsonObject2 = (JSONObject)obj1;
        JSONArray array = (JSONArray) jsonObject2.get("book");
       for (int i=0;i<array.size();i++)
       {
           JSONObject jsonObject3 = (JSONObject) array.get(i);
           System.out.println("author is  "+jsonObject3.get("author"));
           System.out.println("price is  "+jsonObject3.get("price"));
           System.out.println("Category is  "+jsonObject3.get("category"));
           System.out.println("Title is  "+jsonObject3.get("title"));


       }


    }
}
