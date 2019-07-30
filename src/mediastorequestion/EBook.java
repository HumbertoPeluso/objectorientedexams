package mediastorequestion;

import java.util.Date;

public class EBook extends Product {

    private final double EBOOK_PRICE = 7.0;
    private final String TYPE = "EBOOK";

    public EBook(int id, String title, Date dateBorrow) {
        super(id, title, dateBorrow);
    }

    @Override
    public double getPrice() {
        return EBOOK_PRICE;
    }

    @Override
    public String toString() {
        return "title: "+this.getTitle()+" " +
                "type: "+TYPE+ " " +
                "....................";
    }
}
