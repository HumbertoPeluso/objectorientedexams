import mediastorequestion.AudioCD;
import mediastorequestion.EBook;
import mediastorequestion.Product;

import java.util.Date;

public class MediaStockMain {
    public static void main(String[]args){

        // products

        Product product1 = new EBook(1, "EBOOK1", new Date());

        System.out.println(product1.toString());


    }
}
