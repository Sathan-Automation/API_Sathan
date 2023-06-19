package ComplexPojo_book;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialization {

    public static void main(String[] args) throws IOException {

        Store store = new Store();

        Book book1 = new Book();
        book1.setCategory("reference");
        book1.setAuthor("Nigel Rees");
        book1.setTitle("Sayings of the Century");
        book1.setPrice(8.95);

        Book book2 = new Book();
        book2.setCategory("fiction");
        book2.setAuthor("Evelyn Waugh");
        book2.setTitle("Sword of Honour");
        book2.setPrice(12.99);

        Book book3 = new Book();
        book3.setCategory("fiction");
        book3.setAuthor("Herman Melville");
        book3.setTitle("Moby Dick");
        book3.setPrice(8.99);

        Book book4 = new Book();

        book4.setCategory("fiction");
        book4.setAuthor("J. R. R. Tolkien");
        book4.setTitle("The Lord of the Rings");
        book4.setPrice(22.99);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        Bicycle bicycleinfo = new Bicycle();

        bicycleinfo.setColor("red");
        bicycleinfo.setPrice(19.95);

        store.setBook(books);
        store.setBicycles(bicycleinfo);

        Data data = new Data();
        data.setExpensive(10);
        data.setStore(store);
        ObjectMapper mapper = new ObjectMapper();

        File jsonfile = new File("D:\\IntelliJ\\RestAzuredapi\\src\\test\\java\\ComplexPojo_book\\store.json");

        mapper.writerWithDefaultPrettyPrinter().writeValue(jsonfile,data);


    }
}
