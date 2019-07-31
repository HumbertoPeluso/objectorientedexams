import mediastorequestion.AudioCD;
import mediastorequestion.Custumer;
import mediastorequestion.EBook;
import mediastorequestion.Product;

import java.time.LocalDate;
import java.util.Date;

public class MediaStockMain {
    public static void main(String[] args) {

        // products

        Product product1 = new EBook(1, "EBOOK1", LocalDate.now()); // format: 2019-07-31
        Product product2 = new AudioCD(2, "CD1", LocalDate.now());
        Custumer custumer = new Custumer(100, "Fulano1", LocalDate.of(1999, 07, 31));
        custumer.borrow(product1);
        custumer.borrow(product2);

        custumer.returnProduct(product1, LocalDate.of(2019, 9, 4));
        custumer.returnProduct(product2, LocalDate.of(2019, 7, 11));

        System.out.println(custumer.toString());


    }
}
